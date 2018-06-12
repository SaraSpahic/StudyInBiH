package com.sara.studyinbih.services;

import com.sara.studyinbih.persistence.model.helpers.StudyProgramFilter;
import com.sara.studyinbih.persistence.model.helpers.enums.DegreeLevel;
import com.sara.studyinbih.persistence.model.helpers.enums.Language;
import com.sara.studyinbih.persistence.model.tables.StudyField;
import com.sara.studyinbih.persistence.model.tables.StudyProgram;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.ResultTransformer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudyProgramService extends BaseService {

    private static final String ORDER_KEY = "name";


    /**
     * Gets all StudyProgram.
     *
     * @return the all StudyProgram
     */
    @SuppressWarnings("unchecked")
    public List<StudyProgram> getAllStudyPrograms() {
        return (List<StudyProgram>) getSession().createCriteria(StudyProgram.class)
                .addOrder(Order.asc(ORDER_KEY))
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                .list();
    }

    /**
     * Gets StudyProgram.
     *
     * @param id the id
     * @return the StudyProgram
     */
    public StudyProgram getStudyProgram(final UUID id) {
        return (StudyProgram) getSession().createCriteria(StudyProgram.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    /**
     * Create StudyProgram boolean.
     *
     * @param studyProgram the StudyProgram
     * @return the boolean
     */
    public Boolean createStudyProgram(final StudyProgram studyProgram) {
        getSession().save(studyProgram);
        return true;
    }

    /**
     * Edit studyProgram boolean.
     *
     * @param studyProgram the studyProgram
     * @return the boolean
     */
    public Boolean editStudyProgram(final StudyProgram studyProgram) {
        getSession().update(studyProgram);
        return true;
    }

    /**
     * Delete studyProgram boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public Boolean deleteStudyProgram(final UUID id) {
        StudyProgram studyProgram = (StudyProgram) getSession().createCriteria(StudyProgram.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();

        getSession().delete(studyProgram);
        return true;
    }

    public List<StudyProgram> findStudyProgramsWithFilter(StudyProgramFilter studyProgramFilter) {
        Criteria criteria = getSession().createCriteria(StudyProgram.class);

        if (studyProgramFilter.getDegreeLevel() != null && !studyProgramFilter.getDegreeLevel().equalsIgnoreCase("") && !studyProgramFilter.getDegreeLevel().equals("")) {
            criteria.add(Restrictions.eq("degreeLevel", DegreeLevel.valueOf(studyProgramFilter.getDegreeLevel())));
        }

        if (studyProgramFilter.getLanguage() != null && !studyProgramFilter.getLanguage().equalsIgnoreCase("") && !studyProgramFilter.getLanguage().equals("")) {
            criteria.add(Restrictions.eq("language", Language.valueOf(studyProgramFilter.getLanguage())));

        }

        if (studyProgramFilter.getStudyField() != null && !studyProgramFilter.getStudyField().equalsIgnoreCase("") && !studyProgramFilter.getStudyField().equals("") ) {
            Criteria studyFieldCriteria = criteria.createCriteria("studyFields");
            studyFieldCriteria.add(Restrictions.eq("id", UUID.fromString(studyProgramFilter.getStudyField())));
        }

        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

        return  (List<StudyProgram>) criteria.list();

    }
}





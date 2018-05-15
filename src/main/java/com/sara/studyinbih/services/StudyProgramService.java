package com.sara.studyinbih.services;

import com.sara.studyinbih.persistence.model.tables.StudyProgram;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.UUID;

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
}





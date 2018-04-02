package com.sara.studyinbih.services;


import com.sara.studyinbih.persistence.model.helpers.AdministratorStatistics;
import com.sara.studyinbih.persistence.model.tables.*;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;


/**
 * The type Administrator service.
 */
@Service
public class AdministratorService extends BaseService {

	/**
	 * Delete picture
	 *
	 * @param id the id
	 *
	 */
	public boolean deletePicture(final UUID id) throws Exception {
		UniversityPhoto universityPhoto = (UniversityPhoto) getSession().createCriteria(UniversityPhoto.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult();
		getSession().delete(universityPhoto);
		String path = universityPhoto.getPath().replace("http://localhost:9000","");
		path = new StringBuilder(path).insert(0,"public").toString();
		Files.delete(Paths.get(path));
		return true;
	}

	public AdministratorStatistics getAdministratorStatistics(){
      Long numberOfUniversities = Long.valueOf(getSession().createCriteria(University.class)
                .setProjection(Projections.rowCount())
                .uniqueResult().toString());
      Long numberOfLocations = Long.valueOf(getSession().createCriteria(City.class)
              .setProjection(Projections.rowCount())
              .uniqueResult().toString());
      Long numberOfUsers = Long.valueOf(getSession().createCriteria(User.class)
              .setProjection(Projections.rowCount())
              .uniqueResult().toString());
      Long numberOfStudyFields = Long.valueOf(getSession().createCriteria(StudyField.class)
              .setProjection(Projections.rowCount())
              .uniqueResult().toString());

      return AdministratorStatistics.createAdminStatistics()
              .setNumberOfUniversities(numberOfUniversities)
              .setNumberOfLocations(numberOfLocations)
              .setNumberOfUsers(numberOfUsers)
              .setNumberOfStudyFields(numberOfStudyFields);
	}

}

package com.sara.studyinbih.services;

import com.sara.studyinbih.persistence.model.helpers.PaginationAdapter;
import com.sara.studyinbih.persistence.model.helpers.PopularLocation;
import com.sara.studyinbih.persistence.model.helpers.PopularUniversitiesBean;
import com.sara.studyinbih.persistence.model.helpers.UniversityFilter;
import com.sara.studyinbih.persistence.model.helpers.forms.ImageUploadForm;
import com.sara.studyinbih.persistence.model.helpers.forms.ReviewForm;
import com.sara.studyinbih.persistence.model.tables.*;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The type University service.
 */
@Service
public class UniversityService extends BaseService {

    private static final String BASE_PATH = "http://localhost:8080/assets/images/";
    private static final String ORDER_KEY = "name";

    /**
     * Create university boolean.
     *
     * @param university the university
     * @throws Exception the exception
     */
    public Boolean createUniversity(final University university) throws Exception {
        getSession().save(university);
        return true;
    }

    /**
     * Edit university boolean.
     *
     * @param university the university
     * @throws Exception the exception
     */
    public Boolean editUniversity(final University university) throws Exception {
        getSession().merge(university);
        return true;
    }

    public List<University> getAllUniversities() {

        return (List<University>) getSession().createCriteria(University.class)
                .addOrder(Order.asc(ORDER_KEY))
                .list();
    }


    /**
     * Delete university boolean.
     *
     * @param id the id
     * @throws Exception the exception
     */
    public Boolean deleteUniversity(final UUID id) throws Exception {
        University university = (University) getSession().createCriteria(University.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();

        getSession().delete(university);
        return true;
    }

    /**
     * Find universities with filter pagination adapter.
     *
     * @param universityFilter the university filter
     * @return the pagination adapter
     */
    @SuppressWarnings("unchecked")
    public PaginationAdapter<University> findUniversitiesWithFilter(final UniversityFilter universityFilter) {
        Criteria criteria = getSession().createCriteria(University.class);

        if (universityFilter.name != null) {
            criteria.add(Restrictions.ilike("name", universityFilter.name, MatchMode.ANYWHERE));
        }

        if (universityFilter.studyField != null && !universityFilter.studyField.isEmpty()) {
            Criteria studyFieldCriteria = criteria.createCriteria("studyFields");
            Disjunction disjunction = Restrictions.disjunction();
            for (String singleStudyField : universityFilter.studyField.split(",")) {
                disjunction.add(Restrictions.eq("name", singleStudyField));
            }
            studyFieldCriteria.add(disjunction);

        }

        if (universityFilter.cityId != null) {
            criteria.add(Restrictions.eq("city.id", universityFilter.cityId));
        }

        if (universityFilter.price != null && universityFilter.price != 0) {
            criteria.add(Restrictions.eq("priceRange", universityFilter.price));
        }

        if (universityFilter.rating != null && universityFilter.rating != 0) {
            criteria.add(Restrictions.eq("starRating", universityFilter.rating));
        }

        Long numberOfPages = ((Long) criteria.setProjection(Projections.rowCount()).uniqueResult()) / universityFilter.pageSize;

        criteria.setProjection(null)
                .setFirstResult((universityFilter.pageNumber - 1) * universityFilter.pageSize)
                .setMaxResults(universityFilter.pageSize);


        if (universityFilter.sortBy.equals("price")) {
            criteria.addOrder(Order.desc("priceRange"));
        }

        criteria.addOrder(Order.asc("name")).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

        List<University> universities = criteria.list();

        switch (universityFilter.sortBy) {
            case "rating":
                universities.sort((o1, o2) -> o2.getAverageRating().compareTo(o1.getAverageRating()));
                break;
        }

        return PaginationAdapter.createOutput()
                .setPageNumber(universityFilter.pageNumber)
                .setPageSize(universityFilter.pageSize)
                .setModel(universities)
                .setNumberOfPages(numberOfPages);
    }

    /**
     * Gets university with id.
     *
     * @param id the id
     * @return the university with id
     */
    public University getUniversityWithId(final UUID id) {
        return (University) getSession().createCriteria(University.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    /**
     * Gets nearby universities.
     *
     * @param latitude  the latitude
     * @param longitude the longitude
     * @return the nearby universities
     */
    @SuppressWarnings("unchecked")
    public List<University> getNearbyUniversities(final Float latitude, final Float longitude) {
        return getSession()
                .createSQLQuery("SELECT * FROM university WHERE university.longitude <> 0 AND university.latitude <> 0 ORDER BY ST_Distance(ST_GeomFromText('POINT(' || university.longitude || ' ' || university.latitude || ')' ,4326), ST_GeomFromText('POINT(' || :longitude || ' ' || :latitude || ')',4326)) ASC LIMIT 3")
                .addEntity(University.class)
                .setParameter("longitude", longitude)
                .setParameter("latitude", latitude)
                .list();
    }

    /**
     * Gets popular universities.
     *
     * @return the popular universities
     */
    @SuppressWarnings("unchecked")
    public List<University> getPopularUniversities() {

        List<PopularUniversitiesBean> popularUniversitiesBeans = getSession().createCriteria(Request.class, "request")
                .createAlias("request.studyProgram", "studyProgram")
                .setProjection(Projections.projectionList()
                        .add(Projections.groupProperty("studyProgram.universityId").as("universityId"))
                        .add(Projections.count("studyProgram").as("studyProgramCount")))
                .addOrder(Order.asc("studyProgramCount"))
                .setResultTransformer(Transformers.aliasToBean(PopularUniversitiesBean.class))
                .setMaxResults(6)
                .list();

        if (popularUniversitiesBeans.size() > 0) {
            List<UUID> popularUniversitiesIds = popularUniversitiesBeans.stream().map(PopularUniversitiesBean::getUniversityId).collect(Collectors.toList());

            return (List<University>) getSession().createCriteria(University.class)
                    .add(Restrictions.in("id", popularUniversitiesIds))
                    .addOrder(Order.asc("name"))
                    .list();
        }

        return new ArrayList<>();
    }

    /**
     * Gets popular locations.
     *
     * @return the popular locations
     */
    @SuppressWarnings("unchecked")
    public List<PopularLocation> getPopularLocations() {
        List<Object[]> popularLocations = getSession().createCriteria(University.class)
                .setProjection(Projections.projectionList()
                        .add(Projections.groupProperty("city"))
                        .add(Projections.count("id").as("numberOfUniversities")))
                .addOrder(Order.desc("numberOfUniversities"))
                .list();

        return popularLocations.stream().map(PopularLocation::new).collect(Collectors.toList());
    }

    /**
     * Post review boolean.
     *
     * @param reviewForm the review form
     * @param user       the user
     */
    public Boolean postReview(final ReviewForm reviewForm, final User user) {
        UniversityReview universityReview = (UniversityReview) getSession().createCriteria(UniversityReview.class)
                .add(Restrictions.eq("universityId", reviewForm.getUniversityId()))
                .add(Restrictions.eq("userId", user.getId()))
                .uniqueResult();
        if (universityReview == null) {
            universityReview = new UniversityReview(
                    reviewForm.getUniversityId(),
                    user.getId(),
                    reviewForm.getReviewScore(),
                    reviewForm.getReviewText()
            );
        } else {
            universityReview.setReview(reviewForm.getReviewText());
            universityReview.setRating(reviewForm.getReviewScore());
        }

        getSession().save(universityReview);
        updateStarRating(reviewForm.getUniversityId());
        return true;
    }

    private void updateStarRating(final UUID universityId) {
        University university = getUniversityWithId(universityId);
        int starRating;
        if (university.getAverageRating() >= 4.75) {
            starRating = 5;
        } else if (university.getAverageRating() >= 4) {
            starRating = 4;
        } else if (university.getAverageRating() >= 3) {
            starRating = 3;
        } else if (university.getAverageRating() >= 2) {
            starRating = 2;
        } else if (university.getAverageRating() >= 0.25) {
            starRating = 1;
        } else {
            starRating = 0;
        }
        university.setStarRating(starRating);
        getSession().save(university);
    }


    /**
     * Gets number of universities.
     *
     * @return the number of universities
     */
    public Long getNumberOfUniversities() {
        return Long.valueOf(getSession().createCriteria(University.class)
                .setProjection(Projections.rowCount())
                .uniqueResult().toString());
    }

    /**
     * Update picture string.
     *
     * @param imageUploadForm the image upload form
     * @return the string
     * @throws Exception the exception
     */
    public String updatePicture(final ImageUploadForm imageUploadForm) throws Exception {
        University university = (University) getSession().createCriteria(University.class)
                .add(Restrictions.eq("id", imageUploadForm.getEntityId()))
                .uniqueResult();

        String newImagePath = BASE_PATH + imageUploadForm.getEntityId() + "-";
        if (imageUploadForm.getImageType().equals("profile")) {
            university.setProfileImagePath(newImagePath);
            newImagePath += imageUploadForm.getImageType() + "." + imageUploadForm.getExtension();
        } else if (imageUploadForm.getImageType().equals("cover")) {
            university.setCoverImagePath(newImagePath);
            newImagePath += imageUploadForm.getImageType() + "." + imageUploadForm.getExtension();
        } else {
            newImagePath += imageUploadForm.getTimestamp() + "." + imageUploadForm.getExtension();
            ;
            UniversityPhoto newPhoto = new UniversityPhoto();
            newPhoto.setUniversityId(imageUploadForm.getEntityId());
            newPhoto.setPath(newImagePath);
            getSession().persist(newPhoto);

            return "{ \"id\": \"" + newPhoto.getId()
                    + "\", \"universityId\": \"" + newPhoto.getUniversityId() + "\", \"path\": \"" + newPhoto.getPath() + "\"}";
        }

        getSession().update(university);
        return "{ \"imageFor\": \"" + imageUploadForm.getImageType() + "\", \"url\": \"" + newImagePath + "\"}";
    }


    public List<StudyProgram> getStudyPrograms(UUID id) {
        Criteria criteria = getSession().createCriteria(StudyProgram.class)
                .add(Restrictions.eq("universityId", id));
        return criteria.list();

    }


    public University getUniversityByProgram(final UUID id) {
        StudyProgram studyProgram = (StudyProgram) getSession().createCriteria(StudyProgram.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        UUID universityId = studyProgram.getUniversityId();
        return getUniversityWithId(universityId);

    }
}

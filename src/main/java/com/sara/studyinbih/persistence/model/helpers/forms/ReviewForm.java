package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;
import com.sara.studyinbih.persistence.model.tables.StudyProgram;
import com.sara.studyinbih.persistence.model.tables.UniversityReview;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The type Review form.
 */
public class ReviewForm extends BaseModel {

    private UUID universityId;
    private Integer reviewScore;
    private String reviewText;
    private String reviewerName;
    private String displayName;
    private String email;
    private String yearsParticipated;
    private UUID studyProgram;
    private Boolean recommends;

    /**
     * Instantiates a new Review form.
     */
    public ReviewForm() {
    }

    /**
     * Gets university id.
     *
     * @return the university id
     */
    public UUID getUniversityId() {
        return this.universityId;
    }

    /**
     * Sets university id.
     *
     * @param universityId the university id
     */
    public void setUniversityId(UUID universityId) {
        this.universityId = universityId;
    }

    /**
     * Gets review text.
     *
     * @return the review text
     */
    public String getReviewText() {
        return this.reviewText;
    }

    /**
     * Sets review text.
     *
     * @param reviewText the review text
     */
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    /**
     * Gets review score.
     *
     * @return the review score
     */
    public Integer getReviewScore() {
        return this.reviewScore;
    }

    /**
     * Sets review score.
     *
     * @param reviewScore the review score
     */
    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYearsParticipated() {
        return yearsParticipated;
    }

    public void setYearsParticipated(String yearsParticipated) {
        this.yearsParticipated = yearsParticipated;
    }

    public UUID getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(UUID studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Boolean getRecommends() {
        return recommends;
    }

    public void setRecommends(Boolean recommends) {
        this.recommends = recommends;
    }

    public UniversityReview createReview(StudyProgram studyProgram) {
        UniversityReview review = new UniversityReview();
        if (this.getReviewScore() != null) {
            review.setRating(this.getReviewScore());
        }
        else {
            review.setRating(5);
        }
        review.setReview(this.reviewText);
        review.setUniversityId(this.universityId);
        review.setEmail(this.email);
        review.setName(this.reviewerName);
        if (this.displayName == null) {
            review.setDisplayName(this.reviewerName);
        } else {
            review.setDisplayName(this.displayName);
        }
        review.setYearsParticipated(this.yearsParticipated);
        review.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        review.setRecommends(this.recommends);
        review.setStudyProgram(studyProgram);

        return review;

    }


}

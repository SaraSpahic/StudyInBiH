package com.sara.studyinbih.persistence.model.tables;


import com.sara.studyinbih.persistence.model.BaseModel;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * The type University review.
 */
@Entity
@Table(name = "university_review")
public class UniversityReview extends BaseModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@Column(name = "university_id")
	private UUID universityId;

	@Column(name = "rating")
	private Integer rating;

	@Column(name = "review", columnDefinition="text")
	private String review;

	@Column(name = "name")
	private String name;

	@Column(name = "display_name")
	private String displayName;

	@Column(name = "email")
	private String email;

	@Column(name = "years_participated")
	private String yearsParticipated;

	@ManyToOne
	@JoinColumn(name = "program_id", referencedColumnName = "id")
	private StudyProgram studyProgram;

	@Column(name = "recommends")
	private Boolean recommends;

	@Column(name = "timestamp")
	private Timestamp timestamp;

	/**
	 * Instantiates a new University review.
	 */
	public UniversityReview() { }

	/**
	 * Instantiates a new University review.
	 *
	 * @param universityId the university id
	 * @param userId       the user id
	 * @param rating       the rating
	 * @param review       the review
	 */
	public UniversityReview(UUID universityId, UUID userId, Integer rating, String review) {
		this.universityId = universityId;
		this.rating = rating;
		this.review = review;
	}


	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public UUID getId() { return id; }

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(UUID id) { this.id = id; }

	/**
	 * Gets university id.
	 *
	 * @return the university id
	 */
	public UUID getUniversityId() { return universityId; }

	/**
	 * Sets university id.
	 *
	 * @param universityId the university id
	 */
	public void setUniversityId(UUID universityId) { this.universityId = universityId; }


	public Integer getRating() { return rating; }

	/**
	 * Sets rating.
	 *
	 * @param rating the rating
	 */
	public void setRating(Integer rating) { this.rating = rating; }

	/**
	 * Gets review.
	 *
	 * @return the review
	 */
	public String getReview() { return review; }

	/**
	 * Sets review.
	 *
	 * @param review the review
	 */
	public void setReview(String review) { this.review = review; }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public StudyProgram getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}

	public Boolean getRecommends() {
		return recommends;
	}

	public void setRecommends(Boolean recommends) {
		this.recommends = recommends;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}

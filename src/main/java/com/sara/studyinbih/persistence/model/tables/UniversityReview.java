package com.sara.studyinbih.persistence.model.tables;


import com.sara.studyinbih.persistence.model.BaseModel;

import javax.persistence.*;
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

	@Column(name = "user_id")
	private UUID userId;

	@Column(name = "rating")
	private Integer rating;

	@Column(name = "review")
	private String review;

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
		this.userId = userId;
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

	/**
	 * Gets user id.
	 *
	 * @return the user id
	 */
	public UUID getUserId() { return userId; }

	/**
	 * Sets user id.
	 *
	 * @param userId the user id
	 */
	public void setUserId(UUID userId) { this.userId = userId; }

	/**
	 * Gets rating.
	 *
	 * @return the rating
	 */
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
}

package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;

import java.util.UUID;

/**
 * The type Review form.
 */
public class ReviewForm extends BaseModel {

	private UUID universityId;
	private Integer reviewScore;
	private String reviewText;

	/**
	 * Instantiates a new Review form.
	 */
	public ReviewForm() { }

	/**
	 * Gets university id.
	 *
	 * @return the university id
	 */
	public UUID getUniversityId()  { return this.universityId; }

	/**
	 * Sets university id.
	 *
	 * @param universityId the university id
	 */
	public void setUniversityId(UUID universityId) { this.universityId = universityId; }

	/**
	 * Gets review text.
	 *
	 * @return the review text
	 */
	public String getReviewText() { return this.reviewText; }

	/**
	 * Sets review text.
	 *
	 * @param reviewText the review text
	 */
	public void setReviewText(String reviewText) { this.reviewText = reviewText; }

	/**
	 * Gets review score.
	 *
	 * @return the review score
	 */
	public Integer getReviewScore() { return this.reviewScore; }

	/**
	 * Sets review score.
	 *
	 * @param reviewScore the review score
	 */
	public void setReviewScore(Integer reviewScore) { this.reviewScore = reviewScore; }
}

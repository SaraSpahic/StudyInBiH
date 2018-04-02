package com.sara.studyinbih.persistence.model.tables;

import com.sara.studyinbih.persistence.model.BaseModel;

import javax.persistence.*;
import java.util.UUID;

/**
 * The type University photo.
 */
@Entity
@Table(name = "university_photo")
public class UniversityPhoto extends BaseModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@Column(name = "university_id")
	private UUID universityId;

	@Column(name = "photo_path")
	private String path;

	/**
	 * Instantiates a new University photo.
	 */
	public UniversityPhoto() { }

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
	 * Gets path.
	 *
	 * @return the path
	 */
	public String getPath() { return path; }

	/**
	 * Sets path.
	 *
	 * @param path the path
	 */
	public void setPath(String path) { this.path = path; }
}
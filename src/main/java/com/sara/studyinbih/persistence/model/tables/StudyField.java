package com.sara.studyinbih.persistence.model.tables;



import com.sara.studyinbih.persistence.model.BaseModel;

import javax.persistence.*;
import java.util.UUID;

/**
 * The type StudyField.
 */
@Entity
@Table(name = "studyField")
public class StudyField extends BaseModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@Column(name = "name")
	private String name;

	/**
	 * Instantiates a new StudyField.
	 */
	public StudyField() { }

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
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() { return name; }

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) { this.name = name; }
}
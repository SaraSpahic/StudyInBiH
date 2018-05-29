package com.sara.studyinbih.persistence.model.tables;


import com.sara.studyinbih.persistence.model.BaseModel;
import com.sara.studyinbih.persistence.model.helpers.enums.DegreeLevel;
import com.sara.studyinbih.persistence.model.helpers.enums.Language;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

/**
 * The type University studyProgram.
 */
@Entity
@Table(name = "studyProgram")
public class StudyProgram extends BaseModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "university_id")
    private UUID universityId;

    @Column(name = "name")
    private String name;

    @Column(name = "language")
    private Language language;

    @Column(name = "degreeLevel")
    private DegreeLevel degreeLevel;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "ECTS")
    private Integer ects;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER)
    @JoinTable(name = "studyProgram_studyField",
            joinColumns = @JoinColumn(name = "study_program_id"), inverseJoinColumns = @JoinColumn(name = "studyField_id"))
    private Set<StudyField> studyFields;


    /**
     * Instantiates a new University studyProgram.
     */
    public StudyProgram() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Gets university id.
     *
     * @return the university id
     */
    public UUID getUniversityId() {
        return universityId;
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
     * Gets studyFields.
     *
     * @return the studyFields
     */
    public Set<StudyField> getStudyFields() {
        return studyFields;
    }

    /**
     * Sets studyFields.
     *
     * @param studyFields the studyFields
     */
    public void setStudyFields(Set<StudyField> studyFields) {
        this.studyFields = studyFields;
    }


    /**
     * Gets name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets language.
     *
     * @return
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language the language
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Gets degree level.
     *
     * @return
     */
    public DegreeLevel getDegreeLevel() {
        return degreeLevel;
    }


    /**
     * Sets degree level.
     *
     * @param degreeLevel the degreeLevel
     */
    public void setDegreeLevel(DegreeLevel degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    /**
     * Gets degree level.
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }


    /**
     * Sets degree duration (in years).
     *
     * @param duration the duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Gets ects.
     *
     * @return
     */
    public Integer getEcts() {
        return ects;
    }

    /**
     * Sets number of ECTS points.
     *
     * @param ects the ects
     */
    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
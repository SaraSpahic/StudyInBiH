package com.sara.studyinbih.persistence.model.helpers.forms;

import com.sara.studyinbih.persistence.model.helpers.enums.DegreeLevel;
import com.sara.studyinbih.persistence.model.helpers.enums.Language;
import com.sara.studyinbih.persistence.model.tables.StudyField;
import com.sara.studyinbih.persistence.model.tables.StudyProgram;
import com.sara.studyinbih.persistence.model.tables.University;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class StudyProgramForm {

    private UUID id;
    private UUID universityId;
    private String name;
    private Language language;
    private DegreeLevel degreeLevel;
    private Integer duration;
    private Integer ects;
    private String description;
    private List<UUID> studyFields;


    public StudyProgramForm() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUniversityId() {
        return universityId;
    }

    public void setUniversityId(UUID universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public DegreeLevel getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(DegreeLevel degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UUID> getStudyFields() {
        return studyFields;
    }

    public void setStudyFields(List<UUID> studyFields) {
        this.studyFields = studyFields;
    }

    public StudyProgram createStudyProgram(University university, Set<StudyField> studyFields){
        StudyProgram studyProgram = new StudyProgram();

        studyProgram.setDegreeLevel(this.degreeLevel);
        studyProgram.setDescription(this.description);
        studyProgram.setDuration(this.duration);
        studyProgram.setEcts(this.ects);
        studyProgram.setLanguage(this.language);
        studyProgram.setName(this.name);
        studyProgram.setStudyFields(studyFields);

        return studyProgram;
    }

}

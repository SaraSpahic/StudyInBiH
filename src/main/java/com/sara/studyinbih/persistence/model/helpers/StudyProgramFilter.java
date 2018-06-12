package com.sara.studyinbih.persistence.model.helpers;

public class StudyProgramFilter {

    private String language;

    private String degreeLevel;

    private String studyField;

    private StudyProgramFilter() {
    }

    public String getLanguage() {
        return language;
    }

    public StudyProgramFilter setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public StudyProgramFilter setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
        return this;
    }

    public String getStudyField() {
        return studyField;
    }

    public StudyProgramFilter setStudyField(String studyField) {
        this.studyField = studyField;
        return this;
    }

    public static StudyProgramFilter createFilter() {
        return new StudyProgramFilter();
    }

}

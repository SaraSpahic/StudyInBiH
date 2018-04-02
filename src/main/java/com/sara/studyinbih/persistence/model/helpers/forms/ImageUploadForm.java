package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;

import java.util.UUID;

/**
 * The type Image upload form.
 */
public class ImageUploadForm extends BaseModel {

    private UUID universityId;
    private String imageType;
    private String extension;
    private String timestamp;

    /**
     * Instantiates a new Image upload form.
     */
    public ImageUploadForm() {}

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
     * Gets image type.
     *
     * @return the image type
     */
    public String getImageType() { return imageType; }

    /**
     * Sets image type.
     *
     * @param imageType the image type
     */
    public void setImageType(String imageType) { this.imageType = imageType; }

    /**
     * Gets extension.
     *
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets extension.
     *
     * @param extension the extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }


    /**
     * Gets timestamp
     *
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
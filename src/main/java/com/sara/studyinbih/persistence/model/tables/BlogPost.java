package com.sara.studyinbih.persistence.model.tables;

import com.sara.studyinbih.persistence.model.BaseModel;
import com.sara.studyinbih.persistence.model.helpers.enums.BlogPostType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "blog")
public class BlogPost extends BaseModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "contents", columnDefinition = "text")
    private String contents;

    @Column(name = "photo")
    private String photo;

    @Column(name = "type")
    private BlogPostType type;

    public BlogPost(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public BlogPostType getType() {
        return type;
    }

    public void setType(BlogPostType type) {
        this.type = type;
    }
}


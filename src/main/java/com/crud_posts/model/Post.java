package com.crud_posts.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Post implements Serializable {
    private Long id;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Post() {

    }

    public Post(Long id, String content, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.updated = updated;
    }

    public Post(String content, LocalDateTime created, LocalDateTime updated) {
        this(null, content, created, updated);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}

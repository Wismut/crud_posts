package com.crud_posts.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Post> posts;
    private Region region;

    public User() {

    }

    public User(Long id, String firstName, String lastName, List<Post> posts, Region region) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.posts = posts;
        this.region = region;
    }

    public User(String firstName, String lastName, List<Post> posts, Region region) {
        this(null, firstName, lastName, posts, region);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}

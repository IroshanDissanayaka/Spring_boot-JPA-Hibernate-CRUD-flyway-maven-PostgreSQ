package com.iroshan.library.author.web;

public class AuthorView {

    private Long id;
    private String name;
    private String description;

    public AuthorView() {
    }

    public AuthorView(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public AuthorView(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

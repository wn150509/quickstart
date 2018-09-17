package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Topic {
    private String background;
    private String title;

    public Topic() {
    }

    public Topic(String background, String title) {
        this.background = background;
        this.title = title;
    }
}
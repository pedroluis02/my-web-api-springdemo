package com.github.pedroluis02.webapidemo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    public Course(String code, String name, String description, List<Topic> topics, List<Tag> tags) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.topics = topics;
        this.tags = tags;
    }

    private int id = -1;
    private String code;
    private String name;
    private String description = "";
    private List<Topic> topics;
    private List<Tag> tags;
}

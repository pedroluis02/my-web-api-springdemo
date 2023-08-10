package com.github.pedroluis02.webapidemo.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CoursePage {
    private int id;
    private String code;
    private String name;
    private List<String> topics;
    private List<String> tags;
}

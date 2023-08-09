package com.github.pedroluis02.webapidemo.api.service;

import com.github.pedroluis02.webapidemo.api.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> list();
    void save(Course course) throws Exception;
}

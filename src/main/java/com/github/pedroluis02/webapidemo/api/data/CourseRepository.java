package com.github.pedroluis02.webapidemo.api.data;

import com.github.pedroluis02.webapidemo.api.model.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> getALl();
    void insert(Course entity) throws Exception;
}

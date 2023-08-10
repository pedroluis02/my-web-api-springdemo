package com.github.pedroluis02.webapidemo.web.data;

import com.github.pedroluis02.webapidemo.web.model.CoursePage;

import java.util.List;

public interface CoursePageRepository {
    List<CoursePage> getAll();
}

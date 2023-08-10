package com.github.pedroluis02.webapidemo.web.data.mapper;

import com.github.pedroluis02.webapidemo.web.data.dto.CoursePageDto;
import com.github.pedroluis02.webapidemo.web.model.CoursePage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoursePageMapper {
    public List<CoursePage> toListModel(CoursePageDto[] modelList) {
        return Arrays.stream(modelList)
                .map(this::toModel).collect(Collectors.toList());
    }

    private CoursePage toModel(CoursePageDto model) {
        return new CoursePage(
                model.id(),
                model.code(),
                model.name(),
                model.topics(),
                model.tags()
        );
    }
}

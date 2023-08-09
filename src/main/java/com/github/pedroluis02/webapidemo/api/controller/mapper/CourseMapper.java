package com.github.pedroluis02.webapidemo.api.controller.mapper;

import com.github.pedroluis02.webapidemo.api.controller.dto.CourseDto;
import com.github.pedroluis02.webapidemo.api.model.Course;
import com.github.pedroluis02.webapidemo.api.model.Tag;
import com.github.pedroluis02.webapidemo.api.model.Topic;

import java.util.List;
import java.util.stream.Collectors;

public class CourseMapper {
    public List<CourseDto> toListDto(List<Course> modelList) {
        return modelList.stream()
                .map(this::toDto).collect(Collectors.toList());
    }

    private CourseDto toDto(Course model) {
        return new CourseDto(
                model.getId(),
                model.getCode(),
                model.getName(),
                toListTopicDto(model.getTopics()),
                toListTagDto(model.getTags())
        );
    }

    private List<String> toListTopicDto(List<Topic> modelList) {
        return modelList.stream()
                .map(this::toTopicDto).collect(Collectors.toList());
    }

    private String toTopicDto(Topic model) {
        return model.getName();
    }

    private List<String> toListTagDto(List<Tag> modelList) {
        return modelList.stream()
                .map(this::toTagDto).collect(Collectors.toList());
    }

    private String toTagDto(Tag model) {
        return model.getName();
    }
}

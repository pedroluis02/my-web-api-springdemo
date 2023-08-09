package com.github.pedroluis02.webapidemo.api.controller.dto;

import java.util.List;

public record CourseDto(int id, String code, String name, List<String> topics, List<String> tags) {

}

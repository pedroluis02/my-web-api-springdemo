package com.github.pedroluis02.webapidemo.web.data.dto;

import java.io.Serializable;
import java.util.List;

public record CoursePageDto(int id, String code, String name, List<String> topics, List<String> tags) implements Serializable {

}

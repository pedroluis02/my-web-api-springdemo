package com.github.pedroluis02.webapidemo.api.controller;

import com.github.pedroluis02.webapidemo.api.controller.dto.CourseDto;
import com.github.pedroluis02.webapidemo.api.controller.mapper.CourseMapper;
import com.github.pedroluis02.webapidemo.api.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;
    private final CourseMapper mapper = new CourseMapper();

    @GetMapping
    public ResponseEntity<List<CourseDto>> list() {
        var values = service.list();
        var dto = mapper.toListDto(values);
        var status = (values.isEmpty()) ? HttpStatus.NO_CONTENT : HttpStatus.OK;

        return ResponseEntity.status(status).body(dto);
    }
}

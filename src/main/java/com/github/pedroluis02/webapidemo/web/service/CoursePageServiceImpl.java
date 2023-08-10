package com.github.pedroluis02.webapidemo.web.service;

import com.github.pedroluis02.webapidemo.web.data.CoursePageRepository;
import com.github.pedroluis02.webapidemo.web.model.CoursePage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursePageServiceImpl implements CoursePageService {
    private final CoursePageRepository repository;

    @Override
    public List<CoursePage> list() {
        return repository.getAll();
    }
}

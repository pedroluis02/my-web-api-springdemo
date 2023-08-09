package com.github.pedroluis02.webapidemo.api.service;

import com.github.pedroluis02.webapidemo.api.model.Course;
import com.github.pedroluis02.webapidemo.api.data.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService{
    private final CourseRepository repository;

    @Override
    public List<Course> list() {
        return repository.getALl();
    }

    @Override
    public void save(Course course) throws Exception {
        repository.insert(course);
    }
}

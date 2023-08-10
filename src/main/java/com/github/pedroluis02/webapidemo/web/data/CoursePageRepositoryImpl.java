package com.github.pedroluis02.webapidemo.web.data;

import com.github.pedroluis02.webapidemo.web.data.dto.CoursePageDto;
import com.github.pedroluis02.webapidemo.web.data.mapper.CoursePageMapper;
import com.github.pedroluis02.webapidemo.web.model.CoursePage;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CoursePageRepositoryImpl implements CoursePageRepository {
    private final CoursePageMapper mapper = new CoursePageMapper();
    private final RestTemplate rest = new RestTemplate();

    @Override
    public List<CoursePage> getAll() {
        var responseEntity = rest.getForEntity("http://localhost:8000/api/v1/courses", CoursePageDto[].class);
        var courseDto = responseEntity.getBody();

        return mapper.toListModel(courseDto);
    }
}

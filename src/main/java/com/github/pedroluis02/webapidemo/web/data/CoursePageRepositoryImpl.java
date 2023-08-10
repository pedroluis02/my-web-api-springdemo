package com.github.pedroluis02.webapidemo.web.data;

import com.github.pedroluis02.webapidemo.web.data.dto.CoursePageDto;
import com.github.pedroluis02.webapidemo.web.data.mapper.CoursePageMapper;
import com.github.pedroluis02.webapidemo.web.model.CoursePage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CoursePageRepositoryImpl implements CoursePageRepository {
    @Value("${app.api.url}")
    private String serverUrl;
    private final CoursePageMapper mapper = new CoursePageMapper();
    private final RestTemplate rest = new RestTemplate();

    @Override
    public List<CoursePage> getAll() {
        var url = serverUrl + "/courses";
        var responseEntity = rest.getForEntity(url, CoursePageDto[].class);
        var courseDto = responseEntity.getBody();

        return mapper.toListModel(courseDto);
    }
}

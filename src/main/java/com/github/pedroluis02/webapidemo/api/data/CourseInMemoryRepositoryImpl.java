package com.github.pedroluis02.webapidemo.api.data;

import com.github.pedroluis02.webapidemo.api.model.Course;
import com.github.pedroluis02.webapidemo.api.model.Tag;
import com.github.pedroluis02.webapidemo.api.model.Topic;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CourseInMemoryRepositoryImpl implements CourseRepository {
    private static final Map<String, Course> courses = new HashMap<>();

    public CourseInMemoryRepositoryImpl() {
        load();
    }

    @Override
    public List<Course> getALl() {
        return new ArrayList<>(courses.values());
    }

    @Override
    public void insert(Course entity) throws Exception {
        if (checkIfExits(entity)) {
            throw new Exception("Code " + entity.getCode() + " exists.");
        }

        if (entity.getId() < 0) {
            entity.setId(generateNewId());
        }

        courses.put(entity.getCode(), entity);
    }

    private void load() {
        List<Course> initialList = List.of(
                new Course(
                        "kotlin-2023",
                        "Kotlin Development",
                        "Kotlin",
                        List.of(new Topic("Java"), new Topic("Kotlin")),
                        List.of(new Tag(1, "Java"), new Tag(2, "Kotlin"))
                ),
                new Course(
                        "android-2023",
                        "Android Development",
                        "Android",
                        List.of(new Topic("Java"), new Topic("Kotlin"), new Topic("Jetpack Compose")),
                        List.of(new Tag(1, "Java"), new Tag(2, "Kotlin"), new Tag(3, "Android"))
                )
        );

        initialList.forEach(course -> {
            try {
                insert(course);
            } catch (Exception ignored) {}
        });
    }

    private boolean checkIfExits(Course entity) {
        return courses.containsKey(entity.getCode());
    }

    private int generateNewId() {
        return (courses.size() + 1);
    }
}

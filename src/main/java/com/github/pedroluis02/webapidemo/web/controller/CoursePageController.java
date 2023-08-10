package com.github.pedroluis02.webapidemo.web.controller;

import com.github.pedroluis02.webapidemo.web.service.CoursePageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
@AllArgsConstructor
public class CoursePageController {
    private final CoursePageService service;

    @RequestMapping
    public String list(Model model) {
        var courses = service.list();
        model.addAttribute("courses", courses);
        return "course_template";
    }
}

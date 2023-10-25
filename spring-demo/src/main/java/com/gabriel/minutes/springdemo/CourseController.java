package com.gabriel.minutes.springdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/courses

@RestController

public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        // En este ejemplo, simplemente creamos dos cursos y los devolvemos
        Course course1 = new Course(1, "Learn AWS", "in28minutes");
        Course course2 = new Course(2, "Learn DevOps", "in28minutes");
        Course course3 = new Course(3, "Learn DevOpsd", "in28minutdes");
        return Arrays.asList(course1, course2, course3);
    }
}
package com.learn.jpa.hibernate.learn_jpa_hibernate.course.jdbc;

import com.learn.jpa.hibernate.learn_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1,"Aws", "Tej"));
        courseJdbcRepository.insert(new Course(2,"Azure", "Tej"));
        courseJdbcRepository.insert(new Course(3,"Devops", "Tej"));
        courseJdbcRepository.insert(new Course(4,"Spring", "Tej"));

        courseJdbcRepository.deleteById(4);
        System.out.println( courseJdbcRepository.findById(3));
    }
}

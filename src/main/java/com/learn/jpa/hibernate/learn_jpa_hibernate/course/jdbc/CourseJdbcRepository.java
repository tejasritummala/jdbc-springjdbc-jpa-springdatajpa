package com.learn.jpa.hibernate.learn_jpa_hibernate.course.jdbc;

import com.learn.jpa.hibernate.learn_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

//    private static String INSERT_QUERY = """
//            insert into course(id, name, author)
//            values(4, 'Spring Boot',  'Teja');
//            """;
//
//    public void insert() {
//        springJdbcTemplate.update(INSERT_QUERY);
//    }


    private static String INSERT_QUERY = """ 
            insert into course(id, name, author)
            values(?, ?, ?);
            """;
    private static String DELETE_QUERY = """ 
            delete from course
            where id = ?;
            """;

    private static String SELECT_QUERY = """ 
            select * from course
            where id = ?;
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
    }

}

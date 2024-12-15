package com.learn.jpa.hibernate.learn_jpa_hibernate.employee;

import com.learn.jpa.hibernate.learn_jpa_hibernate.course.Course;
import com.learn.jpa.hibernate.learn_jpa_hibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private EmployeeJpaRepository repository;

    @Autowired
    private EmployeeSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Employee(1,"Tejesh", "IT"));
//        repository.insert(new Employee(2, "Teja", "IT"));
//        repository.insert(new Employee(3, "Tej", "IT"));
//        repository.insert(new Employee(4,"Teju", "Support"));
//
//        repository.deleteById(4);
//        System.out.println( repository.findById(3));

        repository.save(new Employee(1,"Mahesh", "IT"));
        repository.save(new Employee(2, "Sai", "IT"));
        repository.save(new Employee(3, "Ajay", "IT"));
        repository.save(new Employee(4,"Teju", "Support"));

        repository.deleteById(4l);
        System.out.println( repository.findById(3l));

        System.out.println( repository.findAll());

        System.out.println( repository.count());

        System.out.println( "Employees belongs to IT department");
        System.out.println( repository.findByDeptName("IT"));

        System.out.println( "Employee Mahesh that belongs to IT department");
        System.out.println( repository.findByEmpNameAndDeptName("Mahesh","IT"));

    }
}

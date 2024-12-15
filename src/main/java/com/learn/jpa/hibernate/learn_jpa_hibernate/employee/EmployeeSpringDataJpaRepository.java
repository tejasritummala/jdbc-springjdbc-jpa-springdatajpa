package com.learn.jpa.hibernate.learn_jpa_hibernate.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeSpringDataJpaRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDeptName(String dept_name);

    List<Employee> findByEmpNameAndDeptName(String name, String dept_name);
}

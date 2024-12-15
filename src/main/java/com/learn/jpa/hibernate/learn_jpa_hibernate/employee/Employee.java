package com.learn.jpa.hibernate.learn_jpa_hibernate.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private long id;

    @Column(name="name")
    private String empName;

    @Column(name="dept_name")
    private String deptName;

    public Employee() {
    }

    public Employee(long id, String empName, String deptName) {
        this.id = id;
        this.empName = empName;
        this.deptName = deptName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

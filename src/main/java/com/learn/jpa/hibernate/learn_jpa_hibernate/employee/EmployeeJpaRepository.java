package com.learn.jpa.hibernate.learn_jpa_hibernate.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeJpaRepository {

//    @Autowired
    //instead of autowired we are using more specific annotation called presistent context
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Employee employee) {
        entityManager.merge(employee);
    }

    public void deleteById(long id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }

    public Employee findById(long id) {
        return entityManager.find(Employee.class, id);
    }
}

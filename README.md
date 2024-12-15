CourseJdbcRepository shows Spring JDBC operations.
EmployeeJpaRepository is an example of JPA.
EmployeeSpringDataJpaRepository is an example of Spring Data JPA.


JPA defines specification. It is an API.
    How do you define entities.
    How do you map attributes.
    Who manages entities.

Hibernate is one of the popular implementation of JPA.
We are not using Hibernate annotaions directly as we don't want to lock into hibernate.
We have other implementations like TopLink etc.
We are using hibernate via dependencies.

#Created schema.sql to create databases.
#Used CommandLineRunner FunctionalInterface to execute queries on application start.



Spring JDBC - Used JdbcTemplate to talk to database.
JPA - uses EntityManager to map Beans with tables using @Entity annotation.
Spring Data JPA  - Uses JPARepository Interface.
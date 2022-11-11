package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    List<Employee> retrieveEmployeeWithSurname(@Param("LASTNAME") String lastname);
    List<Employee> findEmployeeByAnyString(@Param("ANYSTRING") String anyString);
}

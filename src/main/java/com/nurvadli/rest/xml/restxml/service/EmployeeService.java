package com.nurvadli.rest.xml.restxml.service;

import com.nurvadli.rest.xml.restxml.domain.Employee;

import java.util.List;
import java.util.Optional;

/**
 * @author Nurvadli
 */
public interface EmployeeService {

    Optional<Employee> findById(Long id);

    List<Employee> findAll();

    List<Employee> findSearch(String name);

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(long id);

}

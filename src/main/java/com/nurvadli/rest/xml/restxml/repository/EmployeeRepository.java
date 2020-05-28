package com.nurvadli.rest.xml.restxml.repository;

import com.nurvadli.rest.xml.restxml.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nurvadli
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDeleteFlag(boolean deleteFlag);

    List<Employee> findByNameContaining(String name);

}

package com.nurvadli.rest.xml.restxml.service.impl;

import com.nurvadli.rest.xml.restxml.domain.Employee;
import com.nurvadli.rest.xml.restxml.repository.EmployeeRepository;
import com.nurvadli.rest.xml.restxml.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Nurvadli
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findSearch(String name) {
        return employeeRepository.findByNameContaining(name);
    }

    @Override
    public Employee save(Employee employee) {
        if(employeeRepository.findById(employee.getId()).isPresent()){
            throw new RuntimeException("Record Already Exist");
        }
       return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        employeeRepository.findById(employee.getId()).orElseThrow(()-> new RuntimeException("Record Not Found"));
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(long id) {
        employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Record Not Found"));
        employeeRepository.deleteById(id);
    }
}

package com.shahabaaz.demo.service;

import com.shahabaaz.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> findAll();

    Optional<Employee> findById(int id);

    void save(Employee theEmployee);

    void deleteById(int id);

}

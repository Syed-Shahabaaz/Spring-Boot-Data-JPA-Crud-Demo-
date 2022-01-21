package com.shahabaaz.demo.service;

import com.shahabaaz.demo.dao.EmployeeRepository;
import com.shahabaaz.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();

    }

    @Override
    public Optional<Employee> findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            throw new RuntimeException("Employee id not found: " + id);
        }

        return Optional.of(theEmployee);
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);

    }

    @Override
    public void deleteById(int id) {

        Optional<Employee> isPresent = findById(id);
        
        employeeRepository.deleteById(id);
    }
}

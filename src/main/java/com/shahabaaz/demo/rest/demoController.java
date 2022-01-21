package com.shahabaaz.demo.rest;

import com.shahabaaz.demo.entity.Employee;
import com.shahabaaz.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class demoController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{empId}")
    public Optional<Employee> findById(@PathVariable int empId) {
        return employeeService.findById(empId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);

        employeeService.save(theEmployee);

        return theEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        employeeService.save(theEmployee);

        return theEmployee;
    }

    @DeleteMapping("/employees/{empId}")
    public String deleteById(@PathVariable int empId) {

        employeeService.deleteById(empId);

        return "Deleted Employee Id: " + empId;

    }

}

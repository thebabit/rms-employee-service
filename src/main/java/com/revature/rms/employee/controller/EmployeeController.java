package com.revature.rms.employee.controller;

import com.revature.rms.employee.entities.Employee;
import com.revature.rms.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value="/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(value="/group",produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Employee> getEmployeesById(Set<Integer> ids){
        Set<Employee> employees = new HashSet<>();
        for (int s : ids) {
            employees.add(employeeService.getEmployeeById(s));
        }
        return employees;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee addNewEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee updateEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.update(employee);
    }

}

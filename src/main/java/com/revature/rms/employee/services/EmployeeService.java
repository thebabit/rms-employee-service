package com.revature.rms.employee.services;


import com.revature.rms.employee.entities.Employee;
import com.revature.rms.employee.exceptions.ResourceNotFoundException;
import com.revature.rms.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository repo) {
        super();
        this.employeeRepo = repo;
    }

    @Transactional(readOnly = true)
    public Employee getEmployeeById(int id) throws ResourceNotFoundException{
        return employeeRepo.findById(id);
    }

    @Transactional
    public Employee update(Employee updatedEmp) {
        return employeeRepo.save(updatedEmp);
    }


    @Transactional
    public Employee addEmployee(Employee newEmployee) {
        return employeeRepo.save(newEmployee);
    }
}

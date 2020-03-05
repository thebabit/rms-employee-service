package com.revature.rms.employee.services;


import com.revature.rms.employee.repositories.EmployeeRepository;
import com.revature.rms.employee.repositories.ResourceMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository repo) {
        super();
        this.employeeRepo = repo;
    }
}

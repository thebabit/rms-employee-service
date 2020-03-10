package com.revature.rms.employee.repositories;


import com.revature.rms.employee.entities.AppUser;
import com.revature.rms.employee.entities.Employee;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    Employee findById(int id);

}

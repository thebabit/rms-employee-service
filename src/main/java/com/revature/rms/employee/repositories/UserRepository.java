package com.revature.rms.employee.repositories;


import com.revature.rms.employee.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Integer> {
    AppUser findAppUserByUsernameAndPassword(String username, String password);
}

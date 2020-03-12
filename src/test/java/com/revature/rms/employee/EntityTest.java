package com.revature.rms.employee;

import com.revature.rms.employee.entities.Employee;
import com.revature.rms.employee.entities.ResourceMetadata;
import com.revature.rms.employee.repositories.EmployeeRepository;
import com.revature.rms.employee.repositories.ResourceMetadataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class EntityTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ResourceMetadataRepository resourceMetadataRepository;

    @Test
    public void testEmp() {
        // given
        Employee check = new Employee("test1","test1","test1","test1");
        entityManager.persist(check);
        entityManager.flush();

        // when
        Employee found = employeeRepository.findByFirstName(check.getFirstName());

        // then


        assertThat(found.getFirstName())
                .isEqualTo(check.getFirstName());
    }

    @Test
    public void testRes() {
        // given
        LocalDate today = LocalDate.now();
        String createdDate = today.toString();
        String lastModifiedDate = today.toString();
        ResourceMetadata check = new ResourceMetadata(1,createdDate,1,lastModifiedDate,1);
        entityManager.persist(check);
        entityManager.flush();

        // when
        ResourceMetadata found = resourceMetadataRepository.findByResourceCreator(1);

        // then


        assertThat(found.getResourceCreator())
                .isEqualTo(check.getResourceCreator());
    }

}
package com.revature.rms.employee.services;


import com.revature.rms.employee.entities.ResourceMetadata;
import com.revature.rms.employee.exceptions.ResourceNotFoundException;
import com.revature.rms.employee.exceptions.ResourcePersistenceException;
import com.revature.rms.employee.repositories.ResourceMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class ResourceMetadataService {

    private ResourceMetadataRepository resourceRepo;

    @Autowired
    public ResourceMetadataService(ResourceMetadataRepository repo) {
        super();
        this.resourceRepo = repo;
    }

    @Transactional(readOnly = true)
    public ResourceMetadata findById(int id)throws ResourceNotFoundException {
        return resourceRepo.findByResourceId(id);
    }

    @Transactional
    public void save(ResourceMetadata newResource) throws ResourcePersistenceException{
        LocalDate today = LocalDate.now();
        String createdDate = today.toString();
        String lastModifiedDate = today.toString();
        newResource.setResourceCreationDateTime(createdDate);
        newResource.setLastModifiedDateTime(lastModifiedDate);
        resourceRepo.save(newResource);
    }

    @Transactional
    public void update(ResourceMetadata updatedResource){
        LocalDate today = LocalDate.now();
        String lastModifiedDate = today.toString();
        updatedResource.setLastModifiedDateTime(lastModifiedDate);
        resourceRepo.save(updatedResource);
    }
}

package com.revature.rms.employee.services;


import com.revature.rms.employee.repositories.ResourceMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceMetadataService {

    private ResourceMetadataRepository resourceRepo;

    @Autowired
    public ResourceMetadataService(ResourceMetadataRepository repo) {
        super();
        this.resourceRepo = repo;
    }
}

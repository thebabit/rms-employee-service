package com.revature.rms.employee.repositories;

import com.revature.rms.employee.entities.ResourceMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceMetadataRepository extends CrudRepository<ResourceMetadata,Integer> {
    ResourceMetadata findByResourceCreator(int id);
    ResourceMetadata findByResourceId(int id);
}

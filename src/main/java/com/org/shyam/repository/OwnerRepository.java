package com.org.shyam.repository;

import com.org.shyam.model.Owner;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends ReactiveCrudRepository<Owner,String> {
}

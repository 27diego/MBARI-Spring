package edu.csumb.sp19.cst438.mbari.repositories;

import edu.csumb.sp19.cst438.mbari.model.equiptment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquiptmentRepository extends MongoRepository<equiptment, String>
{
    equiptment findByName(String name);
}
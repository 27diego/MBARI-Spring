package edu.csumb.sp19.cst438.mbari.repositories;

import org.springframework.stereotype.Repository;

import edu.csumb.sp19.cst438.mbari.model.User;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  User findByUsername(String username);

}
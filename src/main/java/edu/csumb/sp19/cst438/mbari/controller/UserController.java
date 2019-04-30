package edu.csumb.sp19.cst438.mbari.controller;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import edu.csumb.sp19.cst438.mbari.model.User;
import edu.csumb.sp19.cst438.mbari.repositories.UserRepository;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @ApiOperation(value = "List all the users")
  @GetMapping("/users/getAll")
  @ResponseBody
  List<User> getAll() {
    List<User> result = userRepository.findAll();
    return result;
  }

  @PostMapping("/users/add")
  @ApiOperation(value = "Add new user")
  @ResponseBody
  User add(@RequestBody User user) {
    userRepository.save(user);
    return user;
  }

  @GetMapping("/users/get/{id}")
  @ApiOperation(value = "Get user by ID")
  @ResponseBody
  User get(@PathVariable String id) {
    User user = userRepository.findById(id).orElse(new User());
    return user;
  }

  @GetMapping("/users/delete/{id}")
  @ApiOperation(value = "Delete user by ID")
  @ResponseBody
  Boolean delete(@PathVariable String id) {
    userRepository.deleteById(id);
    return true;
  }

}
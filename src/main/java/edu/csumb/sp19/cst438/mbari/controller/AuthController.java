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
public class AuthController {

  @Autowired
  UserRepository userRepository;

  @ApiOperation(value = "Login endpoint")
  @PostMapping("auth/login")
  @ResponseBody
  Boolean login(@RequestParam String username, @RequestParam String password) {
    Boolean login = false;
    User user = userRepository.findByUsername(username);
    if(user != null){
      if (user.getUsername().equals(username)) {
        if (user.getPassword().equals(password)) {
          login = true;
        }
      }
    }
    return login;
  }

}
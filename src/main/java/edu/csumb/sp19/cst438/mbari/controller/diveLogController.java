package edu.csumb.sp19.cst438.mbari.controller;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import edu.csumb.sp19.cst438.mbari.model.User;
import edu.csumb.sp19.cst438.mbari.model.diveLog;
import edu.csumb.sp19.cst438.mbari.repositories.LogRepository;
import edu.csumb.sp19.cst438.mbari.repositories.UserRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class diveLogController
{
    @Autowired
    LogRepository logRepo;
    
    @GetMapping("/divelog/getAll")
    @ResponseBody
    List<diveLog> getAll() {
      List<diveLog> result = logRepo.findAll();
      return result;
    }

    @PostMapping("/divelog/add")
    @ApiOperation(value = "Add new divelog")
    @ResponseBody
    diveLog add(@RequestBody diveLog divelog)
    {
        logRepo.save(divelog);
        return divelog;
    }
    
    @GetMapping("/divelog/get/{id}")
    @ApiOperation(value = "Get divelog by ID")
    @ResponseBody
    diveLog divelog(@PathVariable String id) 
    {
        diveLog divelog = logRepo.findById(id).orElse(new diveLog());
        return divelog;
    }

    @GetMapping("/divelog/delete/{id}")
    @ApiOperation(value = "Delete divelog by ID")
    @ResponseBody
    Boolean delete(@PathVariable String id) 
    {
        logRepo.deleteById(id);
        return true;
    }



    
}
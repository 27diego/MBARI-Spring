package edu.csumb.sp19.cst438.mbari.controller;

import org.springframework.web.bind.annotation.RestController;

import edu.csumb.sp19.cst438.mbari.model.equiptment;
import edu.csumb.sp19.cst438.mbari.repositories.EquiptmentRepository;
import edu.csumb.sp19.cst438.mbari.repositories.LogRepository;
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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class equiptmentController
{
    @Autowired
    EquiptmentRepository equiptmentRepo;

    @GetMapping("/equiptment/getAll")
    @ResponseBody
    List<equiptment> getAll()
    {
        List<equiptment> result = equiptmentRepo.findAll();
        return result;
    }
    
    @PostMapping("/equiptment/add")
    @ApiOperation(value = "Add new equiptment")
    @ResponseBody
    equiptment add(@RequestBody equiptment equipt) {
      equiptmentRepo.save(equipt);
      return equipt;
    }

    @PostMapping("/equiptment/update")
    @ApiOperation(value = "Update equiptment")
    @ResponseBody
    equiptment updateEquiptment(@RequestBody equiptment equip) {
      equiptmentRepo.save(equip);
      return equip;
    }
  

    @GetMapping("/equiptment/get/{id}")
    @ApiOperation(value = "Get equiptment by ID")
    @ResponseBody
    equiptment get(@PathVariable String id) {
      equiptment equipt = equiptmentRepo.findById(id).orElse(new equiptment());
      return equipt;
    }
  
    @GetMapping("/equiptment/delete/{id}")
    @ApiOperation(value = "Delete equiptmebt by ID")
    @ResponseBody
    Boolean delete(@PathVariable String id) {
      equiptmentRepo.deleteById(id);
      return true;
    }


}
package com.TechDhiraj.controller;

import com.TechDhiraj.model.Employee;
import com.TechDhiraj.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.slf4j.Logger.*;

@RestController
@RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
private static final Logger log = LoggerFactory.getLogger(EmployeeController.class.getName());
    @PostMapping("/signup")
    public ResponseEntity<Employee> signUp(@RequestBody Employee employee) {

       log.info("@@@@@Trying to signup for Employee:"+ employee.getEmpName());
        return ResponseEntity.ok(employeeService.signUp(employee));
    }

    @GetMapping("/signin/{empEmailId}/{empPassword}")
public  ResponseEntity<Boolean> signIn(@PathVariable String empEmailId,@PathVariable String empPassword){
        return  ResponseEntity.ok(employeeService.signIn(empEmailId,empPassword));
    }

    @GetMapping
    public ResponseEntity<List<Employee>>getAllEMp(){
        return ResponseEntity.ok(employeeService.getAllEmp());
    }
}

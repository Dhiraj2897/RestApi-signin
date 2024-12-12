package com.TechDhiraj.service;

import com.TechDhiraj.model.Employee;

import java.util.List;
import java.util.Optional;


public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);
    List<Employee> getAllEmp();


    Optional<Employee> getEmpById(int empId);
}

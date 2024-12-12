package com.TechDhiraj.service;

import com.TechDhiraj.model.Employee;
import org.springframework.stereotype.Service;


public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);


}

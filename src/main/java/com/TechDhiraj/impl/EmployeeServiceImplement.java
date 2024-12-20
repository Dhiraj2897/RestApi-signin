package com.TechDhiraj.impl;

import com.TechDhiraj.model.Employee;
import com.TechDhiraj.repository.EmployeeRepository;
import com.TechDhiraj.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplement implements IEmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee signUp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {

        boolean flag = false;
        Employee employee = employeeRepository.findByEmpEmailIdAndEmpPassword(empEmailId, empPassword);

        if (employee != null && employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
            flag = true;
        }

        return flag;
    }

    @Override
    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();

    }

    @Override
    public Optional<Employee> getEmpById(int empId) {
        return employeeRepository.findById(empId);
    }


}

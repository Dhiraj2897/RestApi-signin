package com.TechDhiraj.repository;

import com.TechDhiraj.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //custom method

    Employee findByEmpEmailIdAndEmpPassword(String empEmailId , String empPassword);
}

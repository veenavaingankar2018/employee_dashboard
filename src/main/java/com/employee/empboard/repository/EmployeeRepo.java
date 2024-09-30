package com.employee.empboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.empboard.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}

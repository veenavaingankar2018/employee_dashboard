package com.employee.empboard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empboard.Entity.Employee;
import com.employee.empboard.repository.EmployeeRepo;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody List<Employee> e){
		return ResponseEntity.status(HttpStatus.OK).body(repo.saveAll(e));
	}
	
	@GetMapping
	public ResponseEntity<?> getEmployeeData(){
		return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
	}
}

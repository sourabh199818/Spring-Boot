package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

@Autowired
private EmployeeRepository employeeRepository;

//getting all.employee details
@GetMapping("/employee")
public List<Employee> getAllEmployees()
{
//List<Employee> v = new List<Employee>();

List<Employee> v = employeeRepository.findAll();;
return v;
//return employeeRepository.findAll();
}

//calling specific database using id
@GetMapping("/employee/{id}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
{
	Employee employee = employeeRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" +id));
	return ResponseEntity.ok(employee);
}

//Creating employee rest api
@PostMapping("/employee")
public Employee createEmployee(@RequestBody Employee employee)
{
return employeeRepository.save(employee);
}


//Updating datbase rest API
@PutMapping("/employee/{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails)

{
Employee employee = employeeRepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" +id));

employee.setFirstname(employeeDetails.getFirstname());
employee.setLastname(employeeDetails.getLastname());
employee.setEmailId(employeeDetails.getEmailId());

Employee updatedEmployee = employeeRepository.save(employee);
return ResponseEntity.ok(employee);
}


//Deleting a database
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id)
	{
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" +id));

		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}


}
///api/v1/employee
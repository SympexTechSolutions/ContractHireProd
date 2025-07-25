package com.EmployeeManagementSystem.ems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmsController {
	@Autowired EmsService service;
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	
	@GetMapping("/showAll")
	public List<Employee> showAllEmployee(){
		return service.showAllEmployee();
	}
	
	@GetMapping("/showEmployee/{id}")
	public Employee showEmployeeById(@PathVariable int id) {
		return service.showEmployeeById(id);
	}

	@putMapping("/updateEmployee/{id}")
	public ResponseEnitity updateEmployeeById(@PathVariable int id,@RequestBody Employee e){
		return ResponseEntity.ok(service.updateEmployeeById(id,e));
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
	
}

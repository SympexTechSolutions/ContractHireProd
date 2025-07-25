package com.EmployeeManagementSystem.ems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmsService {
	@Autowired EmsRepository repository;

	public Employee addEmployee(Employee e) {
		return repository.save(e);
	}

	public List<Employee> showAllEmployee() {
		return repository.findAll();
	}

	public Employee showEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteEmployee(int id) {
		repository.deleteById(id);
	}

	public Employee updateEmployeeById(int id, Employee e) {
		Employee emp=repository.findById(id).orElse(null);
		emp.setEmpName(e.getEmpName());
		emp.setExp(e.getExp());
		return repository.save(emp);
	}

}

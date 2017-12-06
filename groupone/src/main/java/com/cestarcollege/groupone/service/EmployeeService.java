package com.cestarcollege.groupone.service;

import java.util.List;

import com.cestarcollege.groupone.Repository.EmployeeRepository;
import com.cestarcollege.groupone.model.Employee;

public interface EmployeeService extends EmployeeRepository {

	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
	
}

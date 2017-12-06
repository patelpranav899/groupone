package com.cestarcollege.groupone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cestarcollege.groupone.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

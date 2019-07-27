package com.careerconsultancy.employee.dao;

import java.util.List;

import com.careerconsultancy.entities.employee.EmployeeDetails;

public interface EmployeeDetailsDao {
	void insert(EmployeeDetails employeeDetails);
	void delete(EmployeeDetails employeeDetails);
	void update(EmployeeDetails employeeDetails);
	EmployeeDetails getbyId(int id);
	List<EmployeeDetails> getAll();

}

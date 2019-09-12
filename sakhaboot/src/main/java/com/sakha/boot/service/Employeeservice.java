package com.sakha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.boot.model.Employee;
import com.sakha.boot.repo.EmployeeRepo;

@Service
public class Employeeservice {

	@Autowired
	EmployeeRepo repo;
	
	public Employee save(Employee emp)
	{
		return repo.save(emp);
	}
	
	
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
		
	}
	
	public List<Employee> getAllemployees()
	{
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId)
	{
		   repo.deleteById(empId);
	}
	
	public Employee getEmployeeByName(String name)
	{
		return repo.getEmployeeByName(name);
	}
}

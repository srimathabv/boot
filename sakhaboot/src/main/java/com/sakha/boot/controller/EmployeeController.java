package com.sakha.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot.model.Employee;
import com.sakha.boot.service.Employeeservice;

@Controller
public class EmployeeController {

	@Autowired
	Employeeservice service;
	
	@PostMapping("/employee")
	public String registerEmployee(@ModelAttribute Employee emp,Model m )
	{
		Employee semp = service.save(emp);
		m.addAttribute("emp",semp);
		return "view";
	
		
		
	}
	
	@GetMapping("/employ")
	public String getEmployee(@RequestParam("id") int empId, Model m)
	{
		Employee emp =service.getEmployee(empId);
		m.addAttribute("emp", emp);
		return "viewemp";
	}
	@GetMapping("/getemp")
	public String getEmployeeByName(@RequestParam("empName") String empName , Model m)
	{
		Employee emp1 = service.getEmployeeByName(empName);
		m.addAttribute("emp1",emp1);
		return "view";
	}
	
	@GetMapping("/employees")
	public String getallEmployees(Model m)
	
	{
		List<Employee> empList = service.getAllemployees();
		m.addAttribute("empList", empList);
		return "viewall";
	}
	
	
	
	
}

package com.sakha.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId ;
	
	String empName;
	
	int age;

  
	public Employee( String empName, int age) {
		super();
		//this.empId = empId;
		this.empName = empName;
		this.age = age;
	}
	Employee()
	{
		
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}
	
	
}

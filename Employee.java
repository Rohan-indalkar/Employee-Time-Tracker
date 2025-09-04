package com.attendance.model;

public class Employee {

	
	private int empid;
	
	private String name;
	
	private String department;
	
	
	public Employee(int empid , String name , String department)
	{
		this.empid=empid;
		
		this.name=name;
		
		this.department=department;
		
	}

	public int getEmpId()
	{
		return empid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDepartment()
	{
		return department;
		
	}
	
}

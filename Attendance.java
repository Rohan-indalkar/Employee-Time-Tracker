package com.attendance.model;

import java.time.LocalDate;

import java.time.LocalTime;


public class Attendance 
{

	private int empid;
	
	private LocalDate date;
	
	private LocalTime check_in;
	
	private LocalTime check_out;
	
	private double hoursWorked;
	
	
	public Attendance(int empid)
	{
		this.empid=empid;
		
		this.date=LocalDate.now();
		
		this.check_in=LocalTime.now();
		
	
		
	}

	public int getEmpId()
	{
		return empid;
	}
	
	public LocalDate getDate()
	{
		return date;
	}
	  public LocalTime getCheckIn() 
	  {
		  return check_in;
	  }
	    
	  public LocalTime getCheckOut()
	  {
		  return check_out;
		}
	    
	  public double getHoursWorked() 
	  {
		  return hoursWorked;
		  
	  }

	  
	  public void checkOut()
	  {
		  this.check_out = LocalTime.now();
		  
		  this.hoursWorked = java.time.Duration.between(check_in, check_out).toHours();
		  
	  }
}

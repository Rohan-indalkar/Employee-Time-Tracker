package com.version2jdbc;

import java.sql.*;

import com.utildb.DBConnection;

public class EmployeeDAO {

	
	public void addEmployee(String name , String dept)
	{
		String sql = "INSERT INTO employees (name, department) VALUES (?, ?)";
		try {
			
			
			
			Connection con =DBConnection.getConnection();

			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2,dept);
			
			ps.executeUpdate();
			
			System.out.println("Employee added Sucessfully");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	
	public void viewEmployee()
	{
		
		String sql="select * from employees";
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			Statement st =con.createStatement();
			
			ResultSet res=st.executeQuery(sql);
			 
			System.out.println("ID | Name | Department");
			 
			
			while ( res.next())
			{
				
				  System.out.println(res.getInt("emp_id") + " | " +
                          res.getString("name") + " | " +
                          res.getString("department"));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	

    public boolean isEmployeeExist(int empId)
    
    {
    
    	String sql = "SELECT emp_id FROM employees WHERE emp_id = ?";
        
    	try (Connection con = DBConnection.getConnection();
        
    			PreparedStatement ps = con.prepareStatement(sql)) {
          
    		ps.setInt(1, empId);
            
    		ResultSet rs = ps.executeQuery();
            
    		return rs.next();
        } 
    	catch (Exception e) {
        
    		e.printStackTrace();
        }
        
    	return false;
    }
}


package com.utildb;

import java.sql.Connection;

import java.sql.DriverManager;


public class DBConnection {

	
	private static final String url ="jdbc:mysql://localhost:3306/attendance_db";

	private static final String user ="root";
	
	private static final String password="Rohan_210315@";
	
	
	 public static Connection getConnection() {
	        try {
	            return DriverManager.getConnection(url, user, password);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}

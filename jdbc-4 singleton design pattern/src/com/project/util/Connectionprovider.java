package com.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionprovider {
	
	private static Connection connection=null;
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b11", "root","sHj@6378#jw");
			System.out.println("connection is sucessfull");
		}
		catch(SQLException a) {
			System.out.println(a.getMessage());
		}
		}
	public static Connection getconnection() {
		System.out.println("Invoked getconnection()");
		if(connection!=null){
			return connection;
			
		}
		else {
			System.out.println("Connection is not established");
			return connection;
		}
		}
	public static  void closeconnection() {
		if(connection!=null) {
			try {
				connection.close();
				System.out.println("connection is closed");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		
			
		
		
	}
		else {
			System.out.println("connection is not closed");
		}
	
	
	
	
	
	}	
	
	
	
	
}

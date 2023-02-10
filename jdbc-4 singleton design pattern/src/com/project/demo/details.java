package com.project.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.util.Connectionprovider;

public class details implements customers {

	@Override
	public void insertQuery(){
			System.out.println("details.insertQuery()");
			String insertquery="insert into customers values(16,'ranjith','M',27,35000)";


			try {
				Connection connection=Connectionprovider.getconnection();
				
				Statement statement=connection.createStatement();
				statement.executeUpdate(insertquery);
				System.out.println("insert query is sucessful");
				
				
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			finally {
				
				Connectionprovider.closeconnection();
			}
			
			
	}

	

		
	

	@Override
	public void readmultipledataQuery() {
		System.out.println("details.readmultipledataQuery()");
		
		String readalldata="select *from customers";
		try {
			Connection connection=Connectionprovider.getconnection();
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(readalldata);
			while(resultset.next()) {
				System.out.println("slno:"+resultset.getInt(1));
				System.out.println("name:"+resultset.getString(2));
				System.out.println("gender:"+resultset.getString(3));
				System.out.println("age:"+resultset.getInt(4));
				System.out.println("salary:"+resultset.getInt(5));
				System.out.println("data readed sucessfully");
				System.out.println("**************************************************");
			}
			
		}
catch(SQLException e) {
	e.getMessage();
}
		finally {
			Connectionprovider.closeconnection();
		}
		
		
	}


	

	@Override
	public void deletedata() {
		System.out.println("details.deletedata()");
		String deletequery="delete from customers where slno = 12 ";
;
		try {
			Connection connection=Connectionprovider.getconnection();
			
			Statement statement=connection.createStatement();
			statement.executeUpdate(deletequery);
			System.out.println("data is deleted sucessfully");
			
			
		}
		catch(SQLException e ) {
			e.getMessage();
		}
		finally {
			Connectionprovider.closeconnection();
		}
		}
		
		
		
	
		
	

	

	@Override
	public void readsinglequery() {
		System.out.println("details.readsinglequery()");
		
		String readsinglequery="select *from customers where slno=8";
		try {
			Connection connection=Connectionprovider.getconnection();
			
			Statement statement= connection.createStatement();
			ResultSet result=statement.executeQuery(readsinglequery);
			while(result.next()) {
				System.out.println("slno:"+result.getInt(1));
				System.out.println("name:"+result.getString(2));
				System.out.println("gender:"+result.getString(3));
				System.out.println("age:"+result.getInt(4));
				System.out.println("salary:"+result.getInt(5));
				System.out.println(" single data readed sucessfully");
				
			}
		}
		catch(SQLException e ) {
			e.getMessage();
		}
		finally {
			Connectionprovider.closeconnection();
		}
	

		
	}

	@Override
	public void updatequery() {
		System.out.println("details.updatequery()");
		String updatequery="update customers set gender='M' where slno=2";
;
		try {
			Connection connection=Connectionprovider.getconnection();
			
			Statement statement=connection.createStatement();
			statement.executeUpdate(updatequery);
			System.out.println("data is updated sucessfully");
			
			
		}
		catch(SQLException e ) {
			e.getMessage();
		}
		finally {
		Connectionprovider.closeconnection();
		}
		}
		


		
	}



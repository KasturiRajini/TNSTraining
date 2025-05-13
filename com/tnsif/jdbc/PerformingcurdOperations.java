package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PerformingcurdOperations {

	public static void main(String[] args) {
		try {
			//step 1 is to register or load the driver
			Class.forName("org.postgresql.Driver");//DriverClassName of postgresql
			System.out.println("Registered the driver sucessfully");
			//step 2 is to get the connection 
			Connection connection = DriverManager.
					getConnection("jdbc:postgresql://localhost:5432/KPRIT","postgres","root");		
			System.out.println("Connected to the driver sucessfully");
			//step 3 is to create a statement object 
			String query = "insert into student values(4,'Laxmi',89)";
			Statement stmt = connection.createStatement();
			//step 4 is to execute the query 
			int k = stmt.executeUpdate(query);
			System.out.println(k+" rows inserted!");
			//step 5 close the connection
			connection.close();
		}catch(Exception exc) {
			exc.getStackTrace();
		}
	}

}

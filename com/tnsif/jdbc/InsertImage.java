package com.tnsif.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertImage {
	public static void main(String args[]) {
		//connection establishment
		
		try {
			String  filepath = "C:\\Users\\kastu\\OneDrive\\Desktop\\K.Rajini.jpg";
			//step 1 register or load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded sucessfully");
			//step 2 get the connection
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KPRIT", "postgres", "root");
			System.out.println("connected to the database sucessfully");
			//step 3 create a stmt object
			String query = "select * from imagedata";
			//PreparedStatement ps = connection.prepareStatement(query);
			Statement stmt = connection.createStatement();
			//read the image file
			/*File image = new File(filepath);
			FileInputStream fis = new FileInputStream(image);
			ps.setBinaryStream(1, fis,(int)image.length());
			//step 4 execute the query
			 * 
			 * 
			int k = ps.executeUpdate();
			if(k > 0) {
				System.out.println("image inserted into database sucessfully");
			}else {
				System.out.println("there is som problem while inserting the data ");
			}*/
			
			//execute query
			
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				byte[] imgBytes = rs.getBytes("image");
				OutputStream os = new FileOutputStream("output.jpg");
				os.write(imgBytes);
				os.close();
				System.out.println("image  saved");
			}
			
			//step 5 close the resources
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

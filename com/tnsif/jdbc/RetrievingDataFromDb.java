package com.tnsif.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrievingDataFromDb {
    public static void main(String[] args) {
        try {
            //step 1 Regiter or load the driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded sucessfully");
            //step 2 Get the connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KPRIT", "postgres", "root");
            System.out.println("connected to the database sucessfully");
            //step 3 create statement object
            Statement stmt = connection.createStatement();
            //step 4 execute the query
            String query = "select * from student";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               int rollno = rs.getInt(1);
               String name = rs.getString(2);
               int marks= rs.getInt(3);
               System.out.println(rollno+" "+name+" "+marks);     
            }
            //step 5 close the connection
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

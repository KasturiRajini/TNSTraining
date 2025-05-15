package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementex {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the student roll no");
            int rollno = sc.nextInt();
            System.out.println("Enter the student name ");
            String name = sc.next();
            System.out.println("Enter the student marks");
            int marks = sc.nextInt();
            //step 1 register the driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded sucessfully");
            //step 2 get the connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KPRIT", "postgres", "root");
            System.out.println("connected to the database sucessfully");
            //step 3 create a stmt object 
            String query = "insert into student values(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setInt(3, marks);
            //step 4 excute the query
            int k = ps.executeUpdate();
            System.out.println(k+" rows inserted!");
            //step 5 close the connection
            connection.close();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

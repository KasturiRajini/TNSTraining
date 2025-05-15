package com.tnsif.jdbc;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Search extends Frame implements ActionListener{
    Label rollno,name,marks;
    TextField t1,t2,t3;
    Button searchb;
    public Search(){
        setLayout(new FlowLayout());
        setSize(300, 400);
        setTitle("Search From Database");
        setVisible(true);
        rollno = new Label("Roll No");
        name = new Label("Name");
        marks = new Label("Marks");
        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        searchb = new Button("Search");
        //add components on to the frame
        add(rollno);add(t1);
        add(name);add(t2);
        add(marks);add(t3);
        add(searchb);
        searchb.addActionListener(this);
    }
    public static void main(String[] args) {
        new Search();  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //get roll no
        int rollno = Integer.parseInt(t1.getText());
        //data base connection establishment 
        try {
            //step 1 register the driver or load the driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded sucessfully");
            //step 2 get the connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KPRIT", "postgres", "root");
            System.out.println("Connected to the database sucessfully");
            //step 3 create a stmt object
            Statement stmt = connection.createStatement();
            String query = "select * from student where rollno = '"+rollno+"'";
            //step 4 exurte queury
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                String name = rs.getString(2);
                int marks  = rs.getInt(3);
                t2.setText(name);
                t3.setText(marks+"");    
            }else{
                t2.setText("no data");
                t3.setText("no data");
            }
            //step 5 close the  connection
            connection.close();   
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }
}

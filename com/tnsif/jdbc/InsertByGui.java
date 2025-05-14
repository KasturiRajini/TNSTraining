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
import java.sql.PreparedStatement;
public class InsertByGui extends Frame implements ActionListener{

    //labels and textfields
    Label rollno,name,marks;
    TextField t1,t2,t3;
    Button submit;
    public InsertByGui(){
        setLayout(new FlowLayout());
        rollno = new Label("Roll No");
        name = new Label("Name");
        marks = new Label("Marks");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        submit = new Button("Submit");
        submit.addActionListener(this);
        //add on to frame
        add(rollno);add(t1);
        add(name);add(t2);
        add(marks);add(t3);
        add(submit);
        setVisible(true);
        setSize(300, 400);
    }
    public static void main(String[] args) {
        new InsertByGui();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //get all the fields
        int rollno = Integer.parseInt(t1.getText());
        String name = t2.getText();
        int marks = Integer.parseInt(t3.getText());
        try {
            //step 1 Register the driver or load the driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded sucessfully");
            //step 2 get the connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KPRIT", "postgres", "root");
            System.out.println("connected to the driver sucessfully");
            //step 3 create a statement object
            String query = "insert into student values('"+rollno+"','"+name+"','"+marks+"')";
            PreparedStatement ps = connection.prepareStatement(query);
            //step 4 execute the query
            int k = ps.executeUpdate();
            System.out.println(k+" row inserted!");
            //step 5 close the connection
            connection.close();
            
        } catch (Exception e1) {
            e1.printStackTrace();
            
        }
    }

}

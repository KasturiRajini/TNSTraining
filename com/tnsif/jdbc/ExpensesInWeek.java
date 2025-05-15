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
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class ExpensesInWeek extends Frame implements ActionListener{
    Label mon,tue,wed,thu,fri,sat,sun,total;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    Button submit,insert;
    public ExpensesInWeek(){
        setLayout(new FlowLayout());
        mon = new Label("MONDAY");
        tue = new Label("TUESDAY");
        wed = new Label("WEDNESDAY");
        thu = new Label("THURSDAY");
        fri = new Label("FRIDAY");
        sat = new Label("SATUARDAY");
        sun = new Label("SUNDAY");
        total = new Label("TOTAL EXP");
        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        t4 = new TextField(30);
        t5 = new TextField(30);
        t6 = new TextField(30);
        t7 = new TextField(30);
        t8 = new TextField(30);
        submit = new Button("Get total expenses in this week");
        insert = new Button("Insert");
        //add components 
        add(mon);add(t1);
        add(tue);add(t2);
        add(wed);add(t3);
        add(thu);add(t4);
        add(fri);add(t5);
        add(sat);add(t6);
        add(sun);add(t7);
        add(total);add(t8);
        add(submit);add(insert);
        submit.addActionListener(this);
        insert.addActionListener(this);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ExpensesInWeek();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //get the fields to insert into database
        int monexp = Integer.parseInt(t1.getText());
        int tuesexp = Integer.parseInt(t2.getText());
        int wedexp = Integer.parseInt(t3.getText());
        int thuexp = Integer.parseInt(t4.getText());
        int friexp = Integer.parseInt(t5.getText());
        int satexp = Integer.parseInt(t6.getText());
        int sunexp = Integer.parseInt(t7.getText());
        String button  = e.getActionCommand();
        List<Integer> list = Arrays.asList(monexp,tuesexp,wedexp,thuexp,friexp,satexp,sunexp);
        
        if (button.equals("Get total expenses in this week")) {
            int total = list.stream().reduce(0, (a,b) -> a + b);
            t8.setText(total+"");  
        }else{
            //establish the connection 
            //get fields
            int tot = Integer.parseInt(t8.getText());
            try {
                //step 1 register the driver 
                Class.forName("org.postgresql.Driver");
                System.out.println("Driver loaded sucessfully");
                //step 2 get the connection
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KPRIT", "postgres", "root");
                System.out.println("Connected to the dtabase sucessfully");
                //step 3 create a stmt object 
                Statement stmt = connection.createStatement();
                String query = 
                "insert into weekexpenses values('"+monexp+"','"+tuesexp+"','"+wedexp+"','"+thuexp+"','"+friexp+"','"+satexp+"','"+sunexp+"','"+tot+"')";
                //step 4 excute the query
                int k = stmt.executeUpdate(query);
                System.out.println(k+" rows inserted");
                //step 5 close the connection
                connection.close();    
            } catch (Exception exception) {
                exception.getStackTrace();
            }       
        }
    }
}

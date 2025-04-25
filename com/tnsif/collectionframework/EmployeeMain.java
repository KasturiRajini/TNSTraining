package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(23, "Rajini", 30000.00f));
        emp.add(new Employee(24, "Shiva", 50000.90f));
        emp.add(new Employee(34, "Swapna", 20000.99f));
        emp.add(new Employee(67, "Srinivas", 25000.78f));
        Collections.sort(emp, new Esal());
        for (Employee employee : emp) {
            System.out.println("Name of Employee : "+employee.ename+", Employee ID : "+employee.eid+",Employee Salary : "+employee.esal);
            
        }

    }

}

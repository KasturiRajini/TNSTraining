package com.tnsif.versioneight;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemoEmp {
    public static void main(String[] args) {
        ArrayList<SEmployee> sem = new ArrayList<>();
        sem.add(new SEmployee(01, "Rajini", 45000.90));
        sem.add(new SEmployee(02, "Tejaswini", 35000.87));
        sem.add(new SEmployee(03, "Shiva Kumar",70000.70));
        sem.add(new SEmployee(04, "Srinivas", 78000));
        sem.add(new SEmployee(05, "Jhansi", 67000));
        sem.add(new SEmployee(07, "Laxmi", 67000.89));
        sem.add(new SEmployee(10, "Venkatadhri", 90000.00));
        sem.add(new SEmployee(11, "Rangamma", 560000));
        Stream<SEmployee> stem = sem.stream().filter(sal -> sal.eSalary > 35000);
        
        // print it on the console

        stem.forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.eSalary));
    }

}

package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student(101, "Rajini", 20));
        s1.add(new Student(102, "ShivaKumar", 22));
        s1.add(new Student(104, "Srinivas", 40));
        s1.add(new Student(106, "Swapna", 35));
        Collections.sort(s1);
        for(Student s:s1){
            System.out.println(s.sid+" "+s.name+" "+s.age);
        }
    }
}

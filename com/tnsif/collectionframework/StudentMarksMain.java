package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMarksMain {
    public static void main(String[] args) {
        ArrayList<StudentMarks> sm = new ArrayList<>();
        sm.add(new StudentMarks("Rajini", 10, 70, 20));
        sm.add(new StudentMarks("Jhansi", 11, 60, 19));
        sm.add(new StudentMarks("Swapna", 12, 78, 32));
        sm.add(new StudentMarks("Shiva", 14, 89,22));
        Collections.sort(sm);
        for(StudentMarks s:sm){
            System.out.println("Name : "+s.name+", ID : "+s.sid+", Percentage : "+s.percentage+", Age : "+s.age);
        }
    }
}

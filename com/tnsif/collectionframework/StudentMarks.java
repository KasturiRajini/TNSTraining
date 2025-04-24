package com.tnsif.collectionframework;

public class StudentMarks implements Comparable<StudentMarks>{
    public String name;
    public int sid;
    public int percentage;
    public int age;

    public StudentMarks(String name,int sid,int percentage,int age){
        this.name = name;
        this.sid = sid;
        this.percentage = percentage;
        this.age = age;
    }
    @Override
    public int compareTo(StudentMarks sm) {
        if(percentage == sm.percentage ){
            return 0;
        }else if(percentage > sm.percentage){
            return 1;
        }else{
            return -1;
        }
    }

}

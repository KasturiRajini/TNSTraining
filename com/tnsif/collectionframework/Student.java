package com.tnsif.collectionframework;

public class Student implements Comparable<Student>{
    public int sid;
    public String name;
    public int age;

    public Student(int sid,String name,int age){
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        if(age == st.age){
            return 0;
        }else if(age > st.age){
            return 1;
        }else{
            return -1;
        }
    }
}

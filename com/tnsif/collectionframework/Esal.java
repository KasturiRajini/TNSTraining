package com.tnsif.collectionframework;

import java.util.Comparator;

public class Esal implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.esal == e2.esal){
            return 0;
        }else if(e1.esal > e2.esal){
            return 1;
        }else{
            return -1;
        }
    }
}

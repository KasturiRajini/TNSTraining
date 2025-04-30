package com.tnsif.versioneight;

import java.util.ArrayList;
import java.util.List;

interface Greeting{
    void message();
}
interface Add{
    // int add(int a,int b);
    void add(int a,int b);
}

public class LamdaExpressionDemo {
    public static void main(String[] args) {
        Greeting m = () -> System.out.print("Hello Rajini!");
        m.message();
        // Add add = (a,b) -> (a + b);
        // System.out.println(add.add(2, 3)); 
        Add add = (a,b) -> System.out.print(a + b);
        add.add(3, 4);

        //iterating using lamda expression
        List<Integer> ll = new ArrayList<>();
        ll.add(5);
        ll.add(4);
        ll.add(7);
        ll.add(4);
        ll.add(5);
        ll.forEach(n -> System.out.println(n)); 
    }

}

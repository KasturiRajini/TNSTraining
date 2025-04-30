package com.tnsif.predefinedinterfaces;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String,String> fun = str ->"String"+str;
        // System.out.println(fun.apply(5));
        System.out.println(fun.apply("Rajini"));

    }

}

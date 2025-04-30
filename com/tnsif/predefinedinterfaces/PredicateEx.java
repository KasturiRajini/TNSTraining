package com.tnsif.predefinedinterfaces;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<String> p = str -> str.length() > 5;
        System.out.println(p.test("Rajini"));
        System.out.println(p.test("Shiva Kumar"));
        System.out.println(p.test("raji"));
    }

}

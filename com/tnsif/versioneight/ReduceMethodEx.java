package com.tnsif.versioneight;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodEx {
    public static void main(String[] args) {
        //Multiply all the elements in a list
        Integer arr[] = {1,2,3,4};
        List<Integer> list = Arrays.asList(arr);
        int product = list.stream().reduce(1, (a,b) -> a * b);
        System.out.println("Product of all the numbers in a list is : "+product);

        //Longest String in a list 

        String str[] = {"Apple","Bannana","Orange","Mango","Pine Apple"};
        List<String> stringList = Arrays.asList(str);
        String maxLength = stringList.stream().reduce((a,b) -> a.length() > b.length() ? a : b).orElse("");
        System.out.println(maxLength);

        //count toatal characters in list of strings 

        String strArr[] = {"hi","hello","world"};
        List<String> strings = Arrays.asList(strArr);
        int totalCharacters = strings.stream().map(String::length).reduce(0, (a,b) -> a + b);
        System.out.println("Total length of the characters are : "+totalCharacters);
         
        //concatenate the strings in a list with comma 

        String concatenate = strings.stream().reduce((a,b) -> a+","+b).orElse("");
        System.out.println("Concatenation of strings in a list are : "+concatenate);
    }

}

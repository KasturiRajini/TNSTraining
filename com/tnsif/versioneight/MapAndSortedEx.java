package com.tnsif.versioneight;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MapAndSortedEx {
    //Intermediate operations map ans  sorted  abstract methods
    public static void main(String[] args) {
       // String str[] = {"Bobby","Rajini","Shiva","Ram"};
        List<String> list = Arrays.asList("bobby","rajini","shiva","swapna","srinivas");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //sorting using sorted intermediate operations
        Integer num[] = {23,45,67,87,56,3,4,2,1};

        List<Integer> numbers = Arrays.asList(num);
        numbers.stream().sorted().forEach(System.out::println);
    }

}

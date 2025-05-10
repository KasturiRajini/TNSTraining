package com.tnsif.versioneight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExamples {
    public static void main(String[] args) {
        //Collect to list 
        String str[] = {"Rajini","shiva kumar","swapna","srinivas","jhansi"};
        List<String> list = Arrays.asList(str);
        List<String> result = list.stream().filter(name -> name.length() > 7).collect(Collectors.toList());
        System.out.println("The  names which are grater than 7 are : "+result); 

        //Collect elements  to set
        Set<Integer> set = Stream.of(1,2,4,5,5,6,7,7,8,8,9,9,10).collect(Collectors.toSet());
        System.out.println("The  set elements are : "+set);

        Set<String> stringset = Stream.of("Rajini","rajini","shiva","Shiva","Shiva","Srinivas","Srinivas","swapna","Swapna")
        .collect(Collectors.toSet());
        System.out.println("The set strings are : "+stringset);

        //Collect elements to map
        List<String> listString = Arrays.asList("Bananana","Orange","Grape","Papaya","Mango");
        Map<String,Integer> map = listString.stream().collect(Collectors.toMap(fruit -> fruit, fruit -> fruit.length()));
        System.out.println("The elemnets in the map are : "+map); 

        //Joining the string 

        String resultt = listString.stream().collect(Collectors.joining(", "));
        System.out.println("String joining : "+resultt);


        //Counting the elements 

        long  count = Stream.of("a","b","c","d","e","f").collect(Collectors.counting());
        System.out.println(count);

        //Grouping by -- > Strings 

        List<String> words = Arrays.asList("apple","ant","banana","bat","cat");
        Map<Character,List<String>> grouped = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println("After grouping : "+grouped);

        //Partioning By  --- >Integers
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> groupNumbers = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(groupNumbers);
    }

}

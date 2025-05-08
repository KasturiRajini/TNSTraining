package com.tnsif.versioneight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceandCollectAbstractMethods {
    public static void main(String[] args) {
        Integer num[] = {10,78,3,5,6,56,43};
        List<Integer> list = Arrays.asList(num);

        //apply reduce method 
        
        int summ = list.stream().reduce(0,Integer::sum);//with method reference
        System.out.println(summ);
  
        int sum = list.stream().reduce(0, (a , b) -> a + b);//without using method reference 
        System.out.println(sum);

        //Finding  maximum value using reduce method 
        int max = list.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
        System.out.println("Maximum value in a list is : "+max);

        //Finding minimum value
         int min = list.stream().reduce(Integer.MAX_VALUE, Math::min);
         System.out.println("Minimum value in a list is : "+min);

         //concatenate the strings using reduce method 

         List<String> words = Arrays.asList("Java","is","fun","!.");

         String sentence = words.stream().reduce("", (a,b) -> a+" "+b).trim();
         System.out.println("After concatenation "+sentence);

        //collect will filter and collect the data

        List<String> names = Arrays.asList("bobby","rajini","jhansi","anusha");

       List<String> filtred = names.stream().filter(name -> name.startsWith("j")).collect(Collectors.toList());
       System.out.println(filtred);
    }

}

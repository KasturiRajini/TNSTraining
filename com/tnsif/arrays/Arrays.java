package com.tnsif.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the array elements ");
        for(int i = 0;i < length;i++){
            arr[i] = sc.nextInt();
        }
       //checking the minimum and maximum element from an array
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for(int i = 0;i < length;i++){
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);

       }
       System.out.println("The minimum eleemnt from an array is : "+min);
       System.out.println("The maximum element from an array is : "+max);
       
    }

}

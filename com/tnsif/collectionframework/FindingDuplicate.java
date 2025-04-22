package com.tnsif.collectionframework;

import java.util.HashSet;

public class FindingDuplicate {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = {3,5,8,9,2,2};
        int duplicate = 0;
        //there will be one duplicate element in an array
        for(int i = 0;i < arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }else{
                duplicate = arr[i];
            }
        }
        System.out.println("The duplicate element from an array is : "+duplicate);

    }

}

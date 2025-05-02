package com.tnsif.versioneight;

import java.util.Scanner;

interface IsVowel{
    boolean isVowel(char character);
}

public class VowelCheck {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("please give a character to check whether it is vowel or consonent");
        String s = sc.next().toLowerCase();
        char character = s.charAt(0);
        IsVowel vowel = (ch) -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        if(vowel.isVowel(character)){
            System.out.println("It is a vowel");
        }else{
            System.out.print("Not a vowel");
        }  
    }
}

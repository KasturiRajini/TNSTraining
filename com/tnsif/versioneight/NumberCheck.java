package com.tnsif.versioneight;
interface IspositiveNumber{
    boolean isPositivenum(int number);
}

public class NumberCheck {
    public static void main(String[] args) {
        IspositiveNumber isp = (number) -> number > 0;
        if(isp.isPositivenum(7)){
            System.out.println(" Is  a positive number");
        }else{
            System.out.println("Is not a negative number");
        }
    }

}

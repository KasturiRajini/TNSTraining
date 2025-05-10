package com.tnsif.versioneight.methodreference;

public class ReferencetoStaticEg {
    public static void displayMessage(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
      Runnable r = ReferencetoStaticEg::displayMessage;
      r.run();
        
        
    }

}

package com.company;

public class ErrorClass {
    public static void main(String[] args) {
        example();
    }
    public static void example(){
       int[] error = new int[999999999];
       for (int i = 0 ; i < 999999999 ; i++ ){
           error[i] = i;
       }

    }
}

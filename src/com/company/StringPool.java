package com.company;

public class StringPool {



    public static void main(String[] args) {

        String productName = "HP";

        String productName2 = "HP";

        String productName3 = productName;

        String value = new String("HP");

        System.out.println(productName == productName2);
    }


}

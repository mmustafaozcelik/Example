package com.company.arraylist;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

    ArrayList<String> word = new ArrayList<String>();

    word.add("mustafa");
    word.add("ali");
    word.remove("ali");
        for (String i:word) {
            System.out.println(i);
        }


    }
}

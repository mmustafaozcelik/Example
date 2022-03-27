package com.company.string;

public class StringExample3 {
    public static void main(String[] args) {
        String key = "radar";
        int index = 0;
        int a = key.length()-1;

            for (int i = 0 ; i < key.length() ; i++){

                if (key.charAt(i) == key.charAt(a)){
                    index++;
                    a--;
                }
            }

        if(index == key.length()){
            System.out.println(key+" Kelimesi palidromdur");
        }else System.out.println(key +" Kelimesi palidrom değildir");
    }
}

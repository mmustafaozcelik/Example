package com.company.string;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime girin");
        String test = scanner.nextLine();
        System.out.println(controlTest(test));
    }
    public static int controlTest(String param){
       int count = 0;
       int j = param.length()-1;
           for (int i = 0 ; i < param.length()/2 ; i++ ) {

               if (param.charAt(i) == param.charAt(j)) {
                   j--;
               } else {
                   j--;
                   count++;
               }
           }

        return count;
    }
}

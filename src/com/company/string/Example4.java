package com.company.string;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cümleyi giriniz");
        String test = scanner.nextLine();
        System.out.println(controlTest(test));
    }
    public static int controlTest(String param){
        for (int i = 0 ; i <param.length() ; i++){
            String cont = (param.charAt(i)+"");
            int a = 0;
            for (int j = 0; j < param.length() ; j++) {
                if (cont.equals(param.charAt(j)+"") ){
                    a++;
                }
            }
            if (a == 1){
                return i;
            }
        }
        return 0;
    }
}

package com.company.string;

import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime girin");
        String test = scanner.nextLine();
        System.out.println(test);
    }
    /*public  static int controlTest(String param){
        List<Character> list= new List<Character>[];

        for (int k = 0 ; k < param.length() ; k++) {
            list.add(param.charAt(k));
        }
        for (int i = 0 ; i < param.length() ; i ++){
            int count = 0 ;
            for (int j = param.length()-1 ; j >= 0 ; j--){
                if (param.charAt(i) == param.charAt(j) && list.size(i)== ){
                    count++;
                }else{

                }
            }
        }
        return 1;
    }*/
}

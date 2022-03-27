package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    }



}



        /*write your code here
        *System.out.println("hello world:D");
        String  userName = "mustafa ";
        System.out.println(userName);
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        int age = scanner.nextInt();
        System.out.println("Merhaba "+userName);
        System.out.println("Yaşınız: "+ age);
        *
        * Scanner scanner = new Scanner(System.in);
        System.out.println("sayı girin girin");
        int number = scanner.nextInt();
        for (int i = 0 ; i <= number ; i++ ){
            System.out.println(i + "lar");
            for (int j = 0 ; j <= number ; j++){
                System.out.println( i + "*" + j +"=" + i * j);
            }

        }
        *
        * Scanner scanner = new Scanner(System.in);
        System.out.println("sayıları girin");
        int nunber = scanner.nextInt(),nunner2 = scanner.nextInt();
        System.out.println("işlem girin");
        String operator = scanner.next();
        if(nunber<0){
            System.out.println(nunber + " sayısı negatidtir");
        }else if(nunber ==0){
            System.out.println(nunber + " Sayısı Sıfırdır " );
        }else {
            System.out.println(nunber + " Sayısı pozitiftir");
        }
        switch (operator){
            case "*" :
                System.out.println(nunber*nunner2 );
                        break;
            case "/":
                System.out.println(nunber/nunner2);
                break;
            case "+":
                System.out.println(nunber + nunner2);
                break;
            case "-" :
                System.out.println(nunber - nunner2);
                break;
            default:
                System.out.println("işlem yok");
                break;
            }

        }
        *
        * Scanner sc = new Scanner(System.in);
    System.out.println("Sayıları giriniz");
    int a = sc.nextInt(), b = sc.nextInt();
    uslu( a , b);
    public static int uslu( int a , int b ){
        if( b <= 0 ) {
            System.out.println("1");
            return 1;
        }else{
           int k = a;

           for (int i = b; i > 1; i--) {
               k = k * a;
           }
           System.out.println(" a^b = " + k);
           return k;
       }
    }
        *
    static void sayHelo(String name){

        System.out.println("merhaba"+ name);
    }
        *
        *
        *
        *  */
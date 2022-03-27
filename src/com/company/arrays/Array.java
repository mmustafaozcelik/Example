package com.company.arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-15 arasında sayı giriniz");
        int value = scanner.nextInt();
        System.out.println(findArray(myArray, value));
    }
    public static int findArray(int[] myArray , int value){
        for ( int i = 0 ;i < myArray.length; i++){
            if (value == myArray[i]){
                return i;
            }
        }
        System.out.println("sayı yok");
        return -1;
    }
}

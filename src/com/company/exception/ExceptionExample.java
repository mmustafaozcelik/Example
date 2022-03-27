package com.company.exception;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[1]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("hatalı index");
        }finally {
            System.out.println("sistem çalıştı");
        }
    }
}

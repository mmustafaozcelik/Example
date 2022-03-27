package com.company.exception;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1,2,3,4};
            System.out.println(numbers[3]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("hata array");
        }catch (Exception exception){
            System.out.println("hata expection");
        }finally {
            System.out.println("çalıştı");
        }
    }
}

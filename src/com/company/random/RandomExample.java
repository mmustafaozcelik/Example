package com.company.random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = randomGenerator();
        boolean flag = true;
        do{
            System.out.println("(0- 100) arasında Sayı girin; ");
            int number = scanner.nextInt();
            if(randomNumber == number) {
                flag = false;
            }else if(randomNumber < number){
                System.out.println("girilen sayı büyük");
            }else{
                System.out.println("girilen sayı küçük");
            }
        }while (flag);
        System.out.println("tebrikler buldunuz");


    }
    static int randomGenerator(){
        return (int) (Math.random()*100);
    }
}

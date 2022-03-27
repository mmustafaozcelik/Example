package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reference {
    int[] notes;
    boolean[] active;
    String[] names ;
    public static void main(String[] args) {
        Reference reference =  new Reference();
        System.out.println(reference.notes);
        System.out.println(reference.active);
        System.out.println(reference.names);

        int[] school = {5,4,3,2,1};
        System.out.println(Arrays.toString(school));
        int[] hingschool = school;
        System.out.println(Arrays.toString(hingschool));
        school[0] = 0 ;
        System.out.println(Arrays.toString(hingschool));
        String mustafa = new String("mustafa");
        String mustafa2 = new String("mustafa");
        System.out.println(mustafa.equals(mustafa2));

        int number = 99;
        System.out.println(number);
        changenumber(number);
        System.out.println(number);
        long[] values = {0,0,0};
        System.out.println(Arrays.toString(values));
        changeReference(values);
        System.out.println(Arrays.toString(values));
    }
    static void changenumber(int number){
        number=23;

    }
    static void changeReference(long[] values){
        values = new long[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıları girin  lütfen ");
        values[0] = scanner.nextLong();
        values[1] = scanner.nextLong();
        values[2] = scanner.nextLong();
        System.out.println(Arrays.toString(values));

    }
}

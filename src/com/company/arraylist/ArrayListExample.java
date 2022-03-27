package com.company.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(12);
        numbers.add("mustafa");
        System.out.println(numbers.size()); //  boyutu  döner
        System.out.println(numbers.get(2)); // parametredeki eleman döner
        System.out.println(numbers.set(0, 23)); // eleman değiştirme
        numbers.remove(0); // parameteredki elemanısiler
        numbers.clear(); // tüm elemanlar siler

        for (Object i : numbers) {
            System.out.println(i);      // listeler üzerinde dönme
        }
        

    }
}

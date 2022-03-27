package com.company.inheritance;

public class SubClass extends  BaseClass {
    static {
        System.out.println("subclas stativ");
    }
    SubClass(){
        System.out.println("subclass const");
    }
}

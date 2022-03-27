package com.company.arraylist;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"mustafa", "özçelik"));
        customers.add(new Customer(2,"ali", "özçelik"));
        customers.add(new Customer(4,"ibo", "özçelik"));
        for (Customer customer:customers) {
            System.out.println(customer.firstName);

        }
    }
}

package com.company.reoly;

public class Product {

    int id; // instance veriable

    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static  Product builder(int id , String name){
        return new Product(id, name);
    }

    public static void main(String[] args) {
    }
}

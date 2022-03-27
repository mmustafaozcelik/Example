package com.company.repositorydemo;

public class Test {

    public static void main(String[] args) {
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}

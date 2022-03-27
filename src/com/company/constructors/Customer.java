package com.company.constructors;

public class Customer {

    private int customerId;

    private String customerName;

    private String transactionInfo;

    public static void main(String[] args) {
        Customer customer = new Customer(1,"mustafa","money transfer");
/*
        customer.customerId = 1;
        customer.customerName = "mustafa";
        customer.transactionInfo = "money transfer";
  */
        System.out.println(customer.customerName);
        System.out.println(customer.customerId);
        System.out.println(customer.transactionInfo);

    }

    public Customer(int customerId, String customerName, String transactionInfo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.transactionInfo = transactionInfo;
    }
}

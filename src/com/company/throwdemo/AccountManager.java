package com.company.throwdemo;

public class AccountManager {
    private double balance ;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void witdrow(double amount) throws BalanceInsufficentException {
        if ((balance-amount) >= 0) {
            balance = getBalance() - amount;
        }else {
            throw  new BalanceInsufficentException("Bakiye yertersiz");
        }
    }

    public double getBalance() {
        return balance;
    }
}

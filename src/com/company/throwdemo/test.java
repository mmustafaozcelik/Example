package com.company.throwdemo;

public class test {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Bakiye: "+ accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Bakiye: "+ accountManager.getBalance());
        try {

            accountManager.witdrow(90);
        }catch (BalanceInsufficentException e){
            e.getMessage();
        }
        System.out.println("Bakiye: "+accountManager.getBalance());
        try {

            accountManager.witdrow(20);
        }catch (BalanceInsufficentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Bakiye: "+accountManager.getBalance());
    }
}

package com.company;

public class Account {
    int accountId;
    String accountName;

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public static void main(String[] args) {
        int accountId = 12;
        String accountName = "mustafa";
        Account account = null;
        account = prinftAccount(accountId , accountName);
    }
    static Account prinftAccount(int accountId , String accountName){
        System.out.println(accountId + "    " + accountName);
        return  new Account(accountId , accountName);
    }
}

package com.company.threadingdemo;

public class Test {
    public static void main(String[] args) {
        KronometreThread kronometreThread = new KronometreThread("mustafa");
        KronometreThread kronometreThread1 = new KronometreThread("mustafa1");
        KronometreThread kronometreThread2 = new KronometreThread("mustafa2");

        kronometreThread.start();
        kronometreThread1.start();
        kronometreThread2.start();

    }
}

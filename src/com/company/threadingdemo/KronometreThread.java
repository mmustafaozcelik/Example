package com.company.threadingdemo;

import static java.lang.Thread.*;

public class KronometreThread implements Runnable{
    private Thread thread;
    private String threadName;
    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("thread oluşturuldu; " +threadName);
    }
    @Override
    public void run() {

        System.out.println("çalıştılıyor ; " +threadName);
        try {
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(i + " : "+threadName);
            Thread.sleep(1000);
        }
        }catch (InterruptedException exception){
            System.out.println("kesildi "+ threadName + exception);
        }
        System.out.println("bitti ; " + threadName);
    }
    public void start(){
        System.out.println("başlatıldı");
        if (thread ==null ){
            thread = new Thread(this , threadName);
            thread.start();
        }
    }
}

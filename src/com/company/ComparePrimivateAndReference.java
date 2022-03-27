package com.company;

public class ComparePrimivateAndReference {
    public static void main(String[] args) {


    int[] value = new int[9999999];
    long firstTime = System.nanoTime();
    for (int i = 0 ; i < 9999999 ; i ++ ){
        value[i] = i ;
    }
    long lastTime = System.nanoTime();

    Integer[] reference = new Integer[9999999];
    long firstTime1 = System.nanoTime();
    for (int i = 0 ; i < 9999999 ; i ++ ){
            value[i] = new Integer(i) ;
    }
    long lastTime2 = System.nanoTime();
        System.out.println((lastTime2 - firstTime1)/(lastTime - firstTime) );
    }

}

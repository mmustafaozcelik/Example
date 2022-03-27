package com.company.exceptiondemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) { //throws
        BufferedReader reader = null;
        int total = 0;
        try {
             reader = new BufferedReader(new FileReader("D:\\mulakat\\deneme\\src\\numbers.txt"));
            String line  = null ;
            while ((line =reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println(total);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            }catch (Exception exception){
                System.out.println("kapanmadı");
            }
        }
    }
}

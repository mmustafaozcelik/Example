package com.company.fileoperaation;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static String url = "D:\\mulakat\\files\\student.txt";
    public static void main(String[] args) {
        //getFileInfo(url);
        readFile(url);
        writeFile(url);
        readFile(url);

    }
    public  static void createFile(String url){
        File file = new File(url);
        try {
            if (file.createNewFile()){// yeni dosya oluşturma
                System.out.println("dosya oluşturuldu");
            }else {
                System.out.println("dosya zaten var");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
    public  static void getFileInfo(String url) {
        File file = new File(url);
        if (file.exists()){
            System.out.println( file.getName()+ " dosyası var");
            System.out.println( file.getAbsolutePath()+ " dosyanın yolu");
            System.out.println( file.canWrite()+ " dosya yazılablilirmöi");
            System.out.println( file.canRead()+ " dosya okunabliemi");
            System.out.println( file.length()+ " dosya boyutu");


        }
    }
    public static void readFile(String url){
        File file = new File(url);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
        }
    }
    public static void writeFile(String url){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(url,true));
            writer.newLine();
            writer.write("ahmet");
            System.out.println("yazıldı");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

package com.company.string;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String key = "Mustafa";
        System.out.println(key.length()); //lenght() boyu
        System.out.println(key.toLowerCase(Locale.ROOT)); //Locale.ROOT localde tüm harfleri küçük yapar
        System.out.println(key.charAt(3)); //charAt(3) verilen parametredeli eleman döner
        System.out.println(key.contains("us")); //contains("us") verilen parametreyi içinde arar
        System.out.println(key.substring(1,2)); //substring(1,2) verilen parametre kısmını keser verir
        System.out.println(key.concat("selam")); //concat("selam") verilen prarametriui sonuna ekler
        System.out.println(key.equalsIgnoreCase("MUStafa")); // equalsIgnoreCase("MUStafa")verilen parametrediki ler lücük buuyk farketmeksizin karşılastırır

    }
}

package com.company.hasmap;

import java.util.HashMap;

public class HasmapExample {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("sözlük","dictorny");
        sozluk.put("book","kitap");
        sozluk.put("claer","temizlemek");
        System.out.println(sozluk.get("book"));
        sozluk.remove("clear");
        System.out.println(sozluk);
        for (String i: sozluk.keySet()) {
            System.out.println(sozluk.get(i));

        }
    }
}

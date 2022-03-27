package com.company;

public class Instance {
    String name;

    String id;

    int note;

    boolean abc;

    public Instance(String name , String id, int note, boolean abc) {
        this.name = name;
        this.id = id;
        this.note = note;
        this.abc = abc;
    }

    public static void main(String[] args) {

        Instance instance = new Instance("abc","asdas",12,false);

        int a = 5;
        System.out.println(a);
    }
}

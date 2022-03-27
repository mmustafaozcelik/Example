package com.company.string;

public class StringExample2 {
    public static void main(String[] args) {
        String key = "hackersdasdasraaannkkssadadas";
        String key2= "hackerranks";
        int index = 0;
        for (int i = 0; i < key.length(); i++){
            if(key.charAt(i) == key2.charAt(index)  ){
                index++;
            }
        }

            if (index == key2.length()){

                System.out.println("Yes");
            }else{
                System.out.println("No");
            }


    }
}

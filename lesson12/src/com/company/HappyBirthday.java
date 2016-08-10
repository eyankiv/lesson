package com.company;

/**
 * Created by Hackeru on 07/08/2016.
 */
public class HappyBirthday {
    private String name;

    public static void wish(String name){
        System.out.println("Happy Birthday "+name+"!");
    }

    public static void wish(){
        wish("to you");
    }
}


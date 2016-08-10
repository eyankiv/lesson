package com.company;

/**
 * Created by Hackeru on 07/08/2016.
 */
public class Overloaded {

    public static void aMethod(int val){System.out.println("int");}
    public static void aMethod(short val){System.out.println("short");}
    public static void aMethod(Object val){System.out.println("Object");}
    public static void aMethod(String val){System.out.println("String");}

    public static void go(){

        /*byte b = 9;
        aMethod(b); // grabs short val, because it is closest to byte.
        aMethod(9); //grabs int as it is an int
        Integer i = 9;
        aMethod(i); // Integer with big I is an object not a primitive int , closer to.
        aMethod("9");*/

        // there is only short and byte and we go to an int , it won't go because can't put big into small

    }

}

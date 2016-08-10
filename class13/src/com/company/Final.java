package com.company;

/**
 * Created by hackeru on 10/08/2016.
 */
public class Final {
}

final class fdog{ // cannot inherit from class fdog, it is final.
    String name;
}

class Car{
    private final int year;

    public static final int MAX_SPEED = 200;//this is a constant int, fixed value.
    public Car(int year){
        this.year = year;
    }

    public void setYear(int year){
        //this.year = year;
    }
}

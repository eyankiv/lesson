package com.company;

import javafx.print.Printer;

public class Main {

    public static void main(String[] args) {
        PrinterType p = PrinterType.INKJET;
        if (p == PrinterType.DOTMATRIX){

        }
    }
}

enum PrinterType{
    DOTMATRIX, INKJET, LASER, THREE_DIMENSIONS, THERMAL

    private int capacity;

    private PrinterType(int capacity){
        this.capacity = capacity;
    }
}

enum Cities{
    KFAR_SABA, RAANANA, HOD_HASHARON, ASHKELON
}
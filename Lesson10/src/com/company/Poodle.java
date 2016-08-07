package com.company;


public class Poodle extends Dog {
    String name;
    public void goToSleep(){
        System.out.println("poddle is going ot sleep " + name);
    }

    void bark(){
        System.out.println("Haf Haf!");
    }
    @Override
    public void makeSound() {
        bark();
    }
}

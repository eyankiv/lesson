package com.company;

/**
 * Created by hackeru on 31/07/2016.
 */
class Dog extends Animal{
    String name;
    void Bark(){
        System.out.println("Waf Waf");
    }

    @Override
    public void goToSleep() {
        System.out.println(name+"going to sleep");
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}

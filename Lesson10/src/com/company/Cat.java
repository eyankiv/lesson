package com.company;

/**
 * Created by hackeru on 31/07/2016.
 */
class Cat extends Animal{
    void growl(){
        System.out.println("Meow Meow");
    }

    @Override
    public void makeSound() {
        growl();
    }
}

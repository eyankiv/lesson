package com.company;

public class Main {

    public static void main(String[] args) {

        int x =5;
        Integer i = x; // putting primitive into non primitive  is called Boxing
        int y = i; // unboxing
        Float f = 34.0f;
        Double d = 14.4;
        Long l = 234L; // if you boxing, you have to use the L otherwise it will be 234 primitive and will
        //be willing to both box and convert from int 234 to long.

        Animal a = new Dog();
        a.makeSound();
        Boolean b = true;
    }

    class Animal{
        String name;
        void makeSound(){
            System.out.println("some sound");
        }
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("Hau hau");
        }

        void makeSound(){
            bark();
        }
    }

    class Cat extends  Animal{
        void growl(){
            System.out.println("mio mio");
        }

    }
}

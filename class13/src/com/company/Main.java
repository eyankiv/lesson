package com.company;

public class Main {

    public static void main(String[] args) {
	    /*Dog d1 = new Dog();
        d1 = new Dog():*/

        Dog d1 = Dog.getDog(); //you always get the same dog, there will never be two of the same dogs.
    }
}

    //how do we make sure we make something unique
    class Dog{

        private static Dog d; //one static field that is part of a class, not an object.

        private Dog(){

        }

        public static Dog getDog(){ //not a method it is an external class.
            if(d == null) // will only create a new dog if its null , the rest of the time it will not create a new dog., it will give the same dog.
                d = new Dog();
            return d;
        }
    }


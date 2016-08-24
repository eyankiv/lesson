package com.company;

import javafx.scene.shape.Circle;

/**
 * Created by hackeru on 14/08/2016.
 */
public class MyClass {

    public  static class myStaticNestedCLass{ // static -,simply for organizing this is nested.

        }
    public class MyInnerClass{ //inner class - when you creating an obj MyClass you are creating this object as part of it.

    }

    public void foo() { //local method of MyClass
        class LocalInnerClass { //cannot use this class outside the local method.
            public int x;

            public void goo() {

            }
        }

        int x = 8;
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.goo();
    }

    void stam() {
        class Dog {


            Dog d = new Dog();

            Circle c = new Circle() {
            };
        }
    }


}



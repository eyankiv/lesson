package com.company;

public class Main {

    public static void main(String[] args) {
        //Nested classes, 4 types:
        /*1. Static nested class 0 simply inside of class
          2. Inner class
          3. local inner class
          4. anonymous class
         */

        MyClass.myStaticNestedCLass myStaticNestedCLass = new MyClass.myStaticNestedCLass();

        MyClass  myClass = new MyClass();
        MyClass.MyInnerClass myInnerClass = myClass.new MyInnerClass();
        MyClass.MyInnerClass myInnerClass2 = myClass.new MyInnerClass();
        myInnerClass.foo():

        //Object o = myClass.foo();
        System.out.println(o.toString());

        //My.Class>myInnerClass myInnerClass2 = new MyClass().new MyInnerClass();

        Animal anim = new Animal(){}; // annonymous statement using the {}, it is a class that inherits from Animal
        //and it has no name it is for this obj only. for its using only
    }

}

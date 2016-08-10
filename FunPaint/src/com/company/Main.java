package com.company;


import graphicshape.Circle;


public class Main {

    public static void main(String[] args) {

        /*Shape s = new shape;
        s.color = 14567;
        System.out.println(s.color);

        Circle c = new circle(());
        c.color = 123;*/

        Circle circle = new Circle();
        System.out.println(circle.area());

        /*Shape[] shapes = {
                new Circle(5),

        }*/

        //Overloaded.go();

        Point p1 = new Point(3,4);
        Point p2 = new Point(3,4);
        if(p1 == p2)
            System.out.println("p1 is equal to p2");
        else
            System.out.println("p1 is NOT equal to p2");
        // result not equal, because you are comparing pointers not elements themselves.

        //now we  use point.p1 to compare objects

    }
}

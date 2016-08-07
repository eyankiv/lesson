package graphicshape;

/**
 * Created by Hackeru on 27/07/2016.
 */
public class Circle extends Shape {
    private int radius; //private variable

    public Circle(int r){
        this.radius = r;
    }

    public double area(){ // public class
        return 3.14 * radius * radius;
    }

    void fillColor(){ //default class
        System.out.println("color: " + color);
    }
}

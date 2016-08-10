package graphicshape;

import com.company.Point;

/**
 * Created by Hackeru on 27/07/2016.
 */
public class Circle extends Shape {
    private int radius; //private variable
    //private int xPos, yPos; // we replace with Point
    private Point center;

    public Circle(Point center,int radius){
        /*this.xPos = xPos;
        this.yPos = yPos;*/
        this.center = center;
        setRadius(radius);
    }

    //we can do this code but it is repeating
  /*  public Circle(int r){
        this.xPos = 10;
        this.yPos = 10;
        setRadius(r);
    }
    public Circle(){
        this.xPos = 10;
        this.yPos = 10;
        setRadius(7);
    }*/

    //instead we do this code, using what we learned:

    public Circle(int r){
        this(new Point(10,10),r);
    }
    // we use this only in constructors, in regular functions gotta use this.
    public Circle(){
        this(7);
    }



    @Override
    public String toString() {
        return "center =  " + center + " and radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Circle){
            Circle other = (Circle)obj;
            return other.center.equals(this.center) && other.radius ==this.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return center.hashCode() ^ radius; // circle turns into an int and we make it different from radius, that is the purpose of the ^.
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(){ // public class
        return 3.14 * radius * radius;
    }

    void fillColor(){ //default class
        System.out.println("color: " + color);
    }

    public void fillColor(int red, int green, int blue){

    }
    //java will let you create same name for method but with different type of parameters,
    //this is called OVERLOADING.
    public void fillColor(float red, float green, float blue){

    }
}

package graphicshape;

/**
 * Created by Hackeru on 27/07/2016.
 */
public class Circle extends Shape {
    private int radius; //private variable
    private int xPos, yPos;

    public Circle(int xPos, int yPos,int radius){
        this.xPos = xPos;
        this.yPos = yPos;
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
        this(10,10,r);
    }
    // we use this only in constructors, in regular functions gotta use this.
    public Circle(){
        this(7);
    }



    @Override
    public String toString() {
        return "center = ( " + xPos + "," + yPos + ") and radius = " +radius;
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

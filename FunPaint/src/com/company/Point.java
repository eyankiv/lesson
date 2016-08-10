package com.company;

/**
 * Created by hackeru on 03/08/2016.
 */
public class Point {
    private int x,y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x<0)
            return;
        this.x = x;
    }

    @Override
    public String toString() {
        return "center = ( " + x + "," + y + ") and radius = " +r;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y<0)
            return;
        this.y = y;
    }

    public double distanceTo(Point other){ //notice x and y are private but this is the same class.
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
}

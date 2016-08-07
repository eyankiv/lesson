package graphicshape;

/**
 * Created by hackeru on 31/07/2016.
 */
public class Rectangle extends Shape{
    private int width, height;

    public Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int width){
        if(width >= 0)
            this.width = width ;
    }

    public void setHeight(int height){
        if(height >= 0)
            this.height = height;
    }

    public double area(){
        return width * height;
    }
}

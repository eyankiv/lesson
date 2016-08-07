package com.company;

/**
 * Created by hackeru on 03/08/2016.
 */
public class Canvas {
    private boolean [][] canvas;

    public Canvas(){
        canvas = new boolean[60][90];
    }

    public void drawRectangle(int x, int y, int width, int height){
        for (int i = 0; i < height; i++) {
            canvas[y + i][x] = true; //draws the sides.
            canvas[y + i][x+width-1] = true; //draws the sides
        }
        for (int i = 0; i < width; i++) {
            canvas[y][x+i] = true;
            canvas[y+height-1][x+i] = true;
        }

    }

    public void renderScreen(){ // this object will control which area will be star and which one will not be.
        for (int i = 0; i < canvas.length; i++) { //60 interactions
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ?"*" : " ");
            }
            System.out.println();
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Button b = new Button();
        b.setListener(new Button.OnClickListener(){
            @Override
            public void onClick() {
                System.out.println("button clicked");
            }
        });

        }

    interface Comparable{
        boolean compare(Object o);
    }

    public static void sort(Comparable [] arr){
        boolean isSorted = false;
        int upTo = arr.length - 1;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < upTo; i++) {
                if(arr[i].compare(arr[i+1])){
                    Comparable temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            upTo--;
        }


    }

    class Point implements Comparable{
        int x, y;

        @Override
        public boolean compare(Object o) {
            if(o == null)
                return false;
            if(o instanceof Point){
                Point other = (Point)o;
                double d1 = this.distanceFromOrigin();
                double d2 = other.distanceFromOrigin();
                if(d1 >d2){
                    return true;
                }else if (d1==d2){
                    if(this.x < other.x)
                        return  true;
                    else if (this.x == other.x){
                        if(this.y < other.y){
                            return true;
                        }
                    }
                }
            }
            return false;

        }

        double distanceFromOrigin(){
            return Math.sqrt(x*x + y*y);
        }
    }


}




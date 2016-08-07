package com.company;

public class Main {

    public static void main(String[] args) {

       /* //RationalNumber q = new RationalNumber();
        q.setNumerator(12);
        q.setDenominator(6);*/

        /*Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Animal();
        animals[2] = new Cat();
        animals[3] = new Poodle();

      *//*  for (Animal animal: animals)
        {
            System.out.println("going to sleep");
        }
       *//**//* for (int i = 0; i < animals.length; i++) {
            Animal.goToSLeep();
        }*/


       Number[] nums = {  //nums acts as length
                new Integer(4),
                new Double(3.4),
                new Long(34L),
                new Float(234.3F),
                3,
                //q // new Class of type Number that we created.
                new RationalNumber(12,6)
        };
        System.out.println(sum(nums));
    }

    public static double sum(Number[] nums){
        double sum =0.0;
        for (Number num : nums){ //num is like i
            sum += num.doubleValue();
            System.out.println(sum);
        }
        return sum;
    }

}


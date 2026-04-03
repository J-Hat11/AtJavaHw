package org.derryfield.math;

public class Algebra {
    public static double HarMean(double x, double y){
        if(x<0 || y<0){
            throw new ArithmeticException("Wrong input values");
        }
        if(x+y == 0){
            throw new ArithmeticException("Wrong input values");
        }
        return (2*x*y)/(x+y);
    }
}

package org.zerock;

public class BmiCalculator {

    public static double cal(double weight, double height){
        double result = 0.0;

        result = weight  / (height * height);

        return result;
    }
}

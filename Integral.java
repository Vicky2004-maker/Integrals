package com.vicky.integrals;

public class Integral {
    public static double findIntegral(double lowerLimit, double upperLimit, Function function, boolean roundOff) {
        double area = 0;
        final double DX = 1E-5;// Increase the exponent to greater number for greater accuracy of area but it takes more time
        double modifier = 1;
        if (lowerLimit > upperLimit) {
            double temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
            modifier = -1;
        }

        for (double i = lowerLimit + DX; i < upperLimit; i += DX) {
            double dFromA = i - lowerLimit;
            area += (DX / 2) * (function.f(lowerLimit + dFromA) + function.f(lowerLimit + dFromA - DX));
        }

        return roundOff ? Math.round(area * modifier) : area * modifier;
    }
}

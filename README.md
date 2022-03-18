# Integrals
Use this method or class to find the value of definite integrals.

How to input functions ?

The common form of the method is _**findIntegrals(upperLimit, LowerLimit, Function, roundItOff);**_

...

        //The return line of code is the function of x which you have to give in as input
        //Using Lambda
        findIntegral(0, PI / 2, x -> {
            return (pow(cos(x), 5) / (pow(sin(x), 5) + pow(cos(x), 5)));
        });
        
        //Wihout Lambda
        findIntegral(0, 5, new Function() {
            @Override
            public double f(double x) {
                return x;
            }
        });
        
...

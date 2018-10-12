package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    public int mpg;
    public int gallons;
    public int fillup;
    public int taketrip;
    public double reportfuel;

    public Automobile(int a){
        mpg = a;
        gallons = 0;
    }

    public int fillUp(int b){
        fillup = b + gallons;
        return fillup;
    }

    public int takeTrip(int c){
        taketrip = c - fillup;
        return taketrip;
    }

    public double reportFuel(double d){
        reportfuel = taketrip;
        return reportfuel;
    }
}

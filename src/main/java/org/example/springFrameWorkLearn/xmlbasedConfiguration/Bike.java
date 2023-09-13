package org.example.springFrameWorkLearn.xmlbasedConfiguration;

import org.example.springFrameWorkLearn.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike Ride");
    }
}

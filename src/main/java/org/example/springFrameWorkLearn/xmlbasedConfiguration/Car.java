package org.example.springFrameWorkLearn.xmlbasedConfiguration;

import org.example.springFrameWorkLearn.Vehicle;

public class Car implements Vehicle {

    @Override
    public void drive(){
        System.out.println("Car Drive");
    }
}

package org.example.springFrameWorkLearn.annoationbasedconfiguration;

import org.example.springFrameWorkLearn.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Jeep implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Jeep Drive");
    }

    @Override
    public String toString() {
        return "Jeep Working";
    }
}

package org.example.springFrameWorkLearn.annoationbasedconfiguration;

import org.example.springFrameWorkLearn.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {

    @Autowired
    private Jeep jeep;

    //we are not passing jeep object in setter or constructor so object will not create we can do with autowired annotation for that need to use @component and @autowired
 /*   public Jeep getJeep() {
        return jeep;
    }

    public void setJeep(Jeep jeep) {
        this.jeep = jeep;
    }
     private Jeep jeep;
    */



    @Override
    public void drive() {
        System.out.println("Truck Drive" + jeep);
    }
}

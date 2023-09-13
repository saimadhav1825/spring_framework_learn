package org.example.springFrameWorkLearn.xmlbasedConfiguration;

public class Tyre {

    String brand;

    public String getBrand() {
        return brand;
    }


    //This Is Setter Injection Means passing any data in setter method
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Constructor Injection   Means passing any data in Constructor
    public Tyre(String brand) {
        this.brand = brand;
    }
}

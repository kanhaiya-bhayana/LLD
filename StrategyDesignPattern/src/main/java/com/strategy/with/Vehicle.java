package com.strategy.with;

import com.strategy.with.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy strategy;

    Vehicle(DriveStrategy strategy){
        this.strategy =strategy;
    }

    public void drive(){
        strategy.drive();
    }
}

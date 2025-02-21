package com.strategy.with;

import com.strategy.with.strategy.DriveStrategy;
import com.strategy.with.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}

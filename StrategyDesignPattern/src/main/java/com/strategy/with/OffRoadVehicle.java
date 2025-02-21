package com.strategy.with;

import com.strategy.with.strategy.DriveStrategy;
import com.strategy.with.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}

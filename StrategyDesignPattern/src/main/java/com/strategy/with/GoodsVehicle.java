package com.strategy.with;

import com.strategy.with.strategy.DriveStrategy;
import com.strategy.with.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}

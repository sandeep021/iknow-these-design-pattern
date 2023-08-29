package ChildClasses;

import BaseClasses.Vehicle;
import Strategy.DriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

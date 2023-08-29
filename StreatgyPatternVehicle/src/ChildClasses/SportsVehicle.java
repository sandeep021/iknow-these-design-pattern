package ChildClasses;

import BaseClasses.Vehicle;
import Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

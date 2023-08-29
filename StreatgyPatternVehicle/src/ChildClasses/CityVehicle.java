package ChildClasses;

import BaseClasses.Vehicle;
import Strategy.DriveStrategy;

//constructor injection: child se parent ko object passing using super keyword.
//city vehicle is a Vehicle and Vehicle has a drive strategy
public class CityVehicle extends Vehicle {
    public CityVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

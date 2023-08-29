package BaseClasses;

import Strategy.DriveStrategy;

//vehicle has a DriveStreatgy
public  class Vehicle {
   DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
       this.driveStrategy = driveStrategy;
   }

   public void drive (){
       driveStrategy.drive();
   }
}

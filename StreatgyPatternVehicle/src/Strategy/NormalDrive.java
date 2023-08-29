package Strategy;

//Normal drive is a drive strategy

public class NormalDrive implements DriveStrategy {
    @Override
    public  void drive () {
        System.out.println("Normal ly Driving the car...");
    }
}

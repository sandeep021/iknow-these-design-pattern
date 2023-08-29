package Strategy;

public class SpecialDrive implements DriveStrategy {
    @Override
    public  void drive () {
        System.out.println("Specially Driving the car...");
    }
}

import BaseClasses.Vehicle;
import ChildClasses.CityVehicle;
import ChildClasses.SportsVehicle;
import Strategy.NormalDrive;
import Strategy.SpecialDrive;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //here new NormalDrive streatgy is passed to vehicle (parent class) which is now dynamically deciding the drive method
        //execution
        Vehicle cityCar = new CityVehicle(new NormalDrive());
        cityCar.drive();

        Vehicle sportCar = new SportsVehicle(new SpecialDrive());
        sportCar.drive();
    }
}
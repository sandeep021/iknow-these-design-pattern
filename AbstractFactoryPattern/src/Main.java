import abstractFactory.AbstractVehicleFactoryImpl;
import objects.Vehicle;
import productFactory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        VehicleFactory luxryVehicleFactory = new AbstractVehicleFactoryImpl().getVehicleFactory("Luxry");
        Vehicle audi = luxryVehicleFactory.getVehicle("Audi");
        Vehicle mercedes = luxryVehicleFactory.getVehicle("Mercedes");
        audi.vehicleModel();
        mercedes.vehicleModel();

        VehicleFactory ordinaryVehicleFactory = new AbstractVehicleFactoryImpl().getVehicleFactory("Ordinary");
        Vehicle suzukiVehicle = ordinaryVehicleFactory.getVehicle("Suzuki");
        Vehicle hyundai = ordinaryVehicleFactory.getVehicle("Hyundai");

        suzukiVehicle.vehicleModel();
        hyundai.vehicleModel();



    }
}
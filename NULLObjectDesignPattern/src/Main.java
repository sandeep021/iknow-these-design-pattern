public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("Bike");

        System.out.println(vehicle.getSeatCapacity());
        System.out.println(vehicle.getTankCapacity());

        //vehicle1 is not a NULL it is a null object so we will not get null exception
        //so we do not need to put null check
        Vehicle vehicle1 = vehicleFactory.getVehicle("Hero");

        System.out.println(vehicle1.getSeatCapacity());
        System.out.println(vehicle1.getTankCapacity());

    }
}
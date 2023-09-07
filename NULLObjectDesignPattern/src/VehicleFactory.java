public class VehicleFactory {
    public Vehicle getVehicle (String vehicleType){
        switch (vehicleType) {
            case "Car":
                return new CarVehicle();
            case "Bike":
                return new BikeVehicle();
            default:
                return new NULLVehicleObject();//returning this object instead of null.
        }

    }
}

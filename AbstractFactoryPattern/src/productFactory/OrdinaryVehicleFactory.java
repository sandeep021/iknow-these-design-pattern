package productFactory;

import objects.*;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "Suzuki":
                return new SuzukiVehicle();
            case "Hyundai":
                return new HyundaiVehicle();
            default:
                return null;
        }
    }
}

package productFactory;

import objects.Vehicle;

//VehicleFactory has a Vehicle
public interface VehicleFactory {
    public Vehicle getVehicle(String type);
}

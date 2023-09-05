package abstractFactory;

import productFactory.VehicleFactory;

public interface AbstractVehicleFactory {
    public VehicleFactory getVehicleFactory(String type);
}

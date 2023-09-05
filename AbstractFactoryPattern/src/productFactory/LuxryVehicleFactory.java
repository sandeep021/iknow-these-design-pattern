package productFactory;

import objects.AudiVehicle;
import objects.MercedesVehicle;
import objects.Vehicle;

public class LuxryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "Mercedes":
                return new MercedesVehicle();
            case "Audi":
                return new AudiVehicle();
            default:
                return null;
        }
    }
}

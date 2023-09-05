package abstractFactory;

import productFactory.LuxryVehicleFactory;
import productFactory.OrdinaryVehicleFactory;
import productFactory.VehicleFactory;

//AbstractVehicleFactory has Vehicle Factory
public class AbstractVehicleFactoryImpl implements AbstractVehicleFactory {
    @Override
    public VehicleFactory getVehicleFactory(String type){
        switch (type) {
            case "Luxry":
                return new LuxryVehicleFactory();
            case "Ordinary":
                return new OrdinaryVehicleFactory();
            default:
                return null;
        }
    }
}

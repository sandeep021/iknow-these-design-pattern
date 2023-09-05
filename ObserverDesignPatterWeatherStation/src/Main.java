import Observers.Device;
import Observers.DeviceImpl;
import observables.WeatherStation;
import observables.WeatherStationImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        WeatherStationImpl weatherStation = new WeatherStationImpl(10.0, 11.0);

        Device device = new DeviceImpl(weatherStation);
        Device device2 = new DeviceImpl(weatherStation);
        Device device3 = new DeviceImpl(weatherStation);
        Device device4 = new DeviceImpl(weatherStation);

        weatherStation.addDevice(device);
        weatherStation.addDevice(device2);
        weatherStation.addDevice(device3);
        weatherStation.addDevice(device4);

        weatherStation.updateWeatherSummary(15, 20);
    }
}
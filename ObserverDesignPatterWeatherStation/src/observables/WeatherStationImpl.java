package observables;

import Observers.Device;
import models.WeatherSummary;

import java.util.ArrayList;
import java.util.List;

//weatherstation has a list of devices
//WeatherStationImpl is a WeatherStation.
public class WeatherStationImpl implements WeatherStation{

    public WeatherSummary weatherSummary = new WeatherSummary();
    List<Device> devices = new ArrayList<>();

    public WeatherStationImpl (double temp, double humidity){
        this.weatherSummary.setTemp(temp);
        this.weatherSummary.setHumidity(humidity);
    }
    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void removeDevice(Device device) {
        devices.remove(device);
    }

    @Override
    public void notifyObservers() {
        for(Device device : devices){
            device.updateMe();
        }
    }

    @Override
    public void updateWeatherSummary(double newTemp, double newHumidity) {
        this.weatherSummary.setTemp(newTemp);
        this.weatherSummary.setHumidity(newHumidity);
        notifyObservers();
    }
}

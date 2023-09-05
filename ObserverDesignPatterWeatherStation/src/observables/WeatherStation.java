package observables;

import Observers.Device;

public interface WeatherStation {

    public void addDevice(Device device);
    public void removeDevice(Device device);
    public void notifyObservers();
    public void updateWeatherSummary(double newTemp, double newHumidity);
}

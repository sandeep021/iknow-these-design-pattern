package Observers;

import observables.WeatherStationImpl;

//device has a weather station to get other data
//DeviceImpl is a device
//
public class DeviceImpl implements Device{

    WeatherStationImpl weatherStation;
    public DeviceImpl (){

    }

    public DeviceImpl (WeatherStationImpl weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void updateMe() {
        System.out.println("WeatherSummaryUpdated temp and  " + weatherStation.weatherSummary.getTemp() + " and humidity " + weatherStation.weatherSummary.getHumidity());
    }
}

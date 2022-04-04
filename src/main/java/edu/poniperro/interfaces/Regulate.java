package edu.poniperro.interfaces;

public interface Regulate {
    void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature);

}

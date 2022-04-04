package edu.poniperro.interfaces;

public interface Heater {
    void onHeater(RoomTemperature temperature);
    void offHeater(RoomTemperature temperature);
}

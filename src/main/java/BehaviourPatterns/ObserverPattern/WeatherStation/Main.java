package BehaviourPatterns.ObserverPattern.WeatherStation;

public class Main {

    static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        ThermostatDisplay thermostatDisplay = new ThermostatDisplay();
        station.Attach(temperatureDisplay);
        station.Attach(thermostatDisplay);

        station.setTemperature(14);
        station.setTemperature(15);
        station.setTemperature(16);
        station.setTemperature(17);
        station.setTemperature(18);

        station.Detach(temperatureDisplay);
        station.setTemperature(19);
        station.setTemperature(20);

        station.Detach(thermostatDisplay);
        station.setTemperature(21);
        station.setTemperature(22);

    }
}

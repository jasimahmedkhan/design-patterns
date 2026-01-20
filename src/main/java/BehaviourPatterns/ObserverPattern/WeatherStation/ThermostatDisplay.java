package BehaviourPatterns.ObserverPattern.WeatherStation;

public class ThermostatDisplay implements IObserver<Float>{

    @Override
    public void update(Float data) {
        System.out.println("Thermostat is set to " + data + "°C");
    }
}

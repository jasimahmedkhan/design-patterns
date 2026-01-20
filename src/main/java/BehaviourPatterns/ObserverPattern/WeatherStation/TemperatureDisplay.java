package BehaviourPatterns.ObserverPattern.WeatherStation;

public class TemperatureDisplay implements IObserver<Float>{

    @Override
    public void update(Float data) {
        System.out.println("Temperature is " + data + "°C");
    }
}


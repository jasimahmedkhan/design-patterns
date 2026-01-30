package BehaviourPatterns.ObserverPattern.WeatherStation;

public class ThermostatDisplay implements IObserver<Float>{

    public ISubject<Float> subject;

    @Override
    public void update(Float data) {
        System.out.println("Thermostat is set to " + data + "°C");
    }

    // Detach the observer from the subject via the interface and Polymorphism behavior
    @Override
    public void detach() {
        subject.Detach(this);

    }
}

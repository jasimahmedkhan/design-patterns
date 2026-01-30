package BehaviourPatterns.ObserverPattern.WeatherStation;

public class TemperatureDisplay implements IObserver<Float>{

    public ISubject<Float> subject;

    public TemperatureDisplay(ISubject<Float> subject) {
        this.subject = subject;
    }

    @Override
    public void update(Float data) {
        System.out.println("Temperature is " + data + "°C");
    }

    // Detach the observer from the subject via the interface and Polymorphism behavior
    @Override
    public void detach() {
        subject.Detach(this);

    }
}

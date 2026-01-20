package BehaviourPatterns.ObserverPattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject<Float>{

    private List<IObserver<Float>> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void Attach(IObserver<Float> observer) {
        if(!observers.contains(observer)){
            System.out.println("Observer already attached and subscribed");
            return;
        }
        observers.add(observer);
    }

    @Override
    public void Detach(IObserver<Float> observer) {
        if(!observers.contains(observer)) {
            System.out.println("Observer not attached and not subscribed");
            return;
        }
        observers.remove(observer);
    }

    @Override
    public void NotifyAllObserver() {
        for(IObserver<Float> observer : observers){
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        NotifyAllObserver();
    }


}

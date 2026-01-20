package BehaviourPatterns.ObserverPattern.WeatherStation;

//Custom System Interface
public interface ISubject<T> {
    void Attach(IObserver<T> observer);
    void Detach(IObserver<T> observer);
    void NotifyAllObserver();
}

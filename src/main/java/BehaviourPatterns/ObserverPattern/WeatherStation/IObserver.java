package BehaviourPatterns.ObserverPattern.WeatherStation;

//Custom Observer Interface
public interface IObserver<T> {
    void update(T data);
}

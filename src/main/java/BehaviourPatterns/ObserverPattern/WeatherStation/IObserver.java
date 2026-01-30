package BehaviourPatterns.ObserverPattern.WeatherStation;

//Custom Observer Interface
public interface IObserver<T> {
    void update(T data);
    // Observer can detach itself from subject
    void detach();
}

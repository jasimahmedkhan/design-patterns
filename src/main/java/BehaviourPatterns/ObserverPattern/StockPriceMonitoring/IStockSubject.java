package BehaviourPatterns.ObserverPattern.StockPriceMonitoring;

public interface IStockSubject {
    void Attach(IStockObserver observer);
    void Detach(IStockObserver observer);
    void NotifyObservers();
}

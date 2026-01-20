package BehaviourPatterns.ObserverPattern.StockPriceMonitoring;

public interface IStockObserver {
    void update(String StockSymbol, float price);
}

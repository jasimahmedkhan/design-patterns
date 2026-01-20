package BehaviourPatterns.ObserverPattern.StockPriceMonitoring;

import java.util.ArrayList;
import java.util.List;

public class StockTicker implements IStockSubject{

    private List<IStockObserver> observers = new ArrayList<>();
    private float price;
    private String symbol;


    @Override
    public void Attach(IStockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(IStockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void NotifyObservers() {
        for (IStockObserver observer : observers) {
            observer.update(this.symbol, this.price);
        }
    }

    public void setPrice(float price){
        this.price = price;
        this.symbol = "SBIN";
        System.out.println("Price updated to " + price);
        NotifyObservers();
    }
}

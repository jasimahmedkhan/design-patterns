package BehaviourPatterns.ObserverPattern.StockPriceMonitoring;

public class BankingApp extends ServiceApp implements IStockObserver {

    @Override
    public void update(String StockSymbol, float price) {
        this.StockSymbol = StockSymbol;
        this.price = price;
        System.out.println("Stock price for Banking App is updated to " + price + " for " + StockSymbol);

    }
}

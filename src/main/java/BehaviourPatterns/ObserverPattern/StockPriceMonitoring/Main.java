package BehaviourPatterns.ObserverPattern.StockPriceMonitoring;

public class Main {

    public static void main(String[] args) {
        StockTicker ticker = new StockTicker();
        BankingApp bankingApp = new BankingApp();
        InvesterApp investerApp = new InvesterApp();
        ticker.Attach(bankingApp);
        ticker.Attach(investerApp);

        ticker.setPrice(1200);
        ticker.setPrice(1250);
        ticker.setPrice(1300);
        ticker.setPrice(1350);
        ticker.setPrice(1400);

        ticker.Detach(bankingApp);
        ticker.setPrice(1450);
        ticker.setPrice(1500);


    }
}

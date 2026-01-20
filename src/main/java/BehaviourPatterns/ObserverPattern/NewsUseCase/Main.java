package BehaviourPatterns.ObserverPattern.NewsUseCase;

public class Main {

    static void main() {
        NewAgency agency = new NewAgency();
        NewsChannel channel = new NewsChannel();

        agency.addPropertyChangeListener(channel);
        agency.setNews( "New product launched");
    }
}

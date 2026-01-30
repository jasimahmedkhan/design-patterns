package BehaviourPatterns.ObserverPattern.NewsUseCase;

public class Main {

    static void main() {
        NewAgency agency = new NewAgency();
        NewsChannel channel = new NewsChannel();
        NewsChannel newsChannel = new NewsChannel();

        agency.addPropertyChangeListener(channel);
        agency.addPropertyChangeListener(newsChannel);
        agency.setNews( "New product launched");
    }
}

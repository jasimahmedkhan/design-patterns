package BehaviourPatterns.ObserverPattern.NewsUseCase;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsChannel implements PropertyChangeListener {

    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        this.news = event.getNewValue().toString();
        System.out.println("Property: " + event.getPropertyName());
        System.out.println("Old Value: " + event.getOldValue());
        System.out.println("New Value: " + event.getNewValue());
        System.out.println("News Channel --> news : " + news);

    }
}

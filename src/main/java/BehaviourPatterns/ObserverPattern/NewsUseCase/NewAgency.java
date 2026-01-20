package BehaviourPatterns.ObserverPattern.NewsUseCase;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewAgency  {

    private String news;

    private PropertyChangeSupport support;

    public NewAgency(){
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        support.removePropertyChangeListener(listener);
    }

    public void setNews(String news){
        String oldNews = this.news;
        this.news = news;
        // Notifies all listeners about the old and new news
        support.firePropertyChange("news", oldNews, news);
    }



}
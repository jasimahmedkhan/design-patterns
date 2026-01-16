package BehaviourPatterns.MomentoPattern.GameExample;

import java.util.ArrayList;
import java.util.List;

public class GameSession {

    public int Level;
    public int Points;
    public List<String> PowerUps = new ArrayList<>();

    public GameMemento saveState() {
        return new GameMemento(Level, Points, PowerUps);
    }

    public void loadState(GameMemento memento) {
        Level = memento.Level;
        Points = memento.Points;
        PowerUps.addAll(memento.PowerUps);
    }
}

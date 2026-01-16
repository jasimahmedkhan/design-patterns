package BehaviourPatterns.MomentoPattern.GameExample;

import java.util.ArrayList;
import java.util.List;

class GameMemento {
    public int Level;
    public int Points;
    public List<String> PowerUps;

    public GameMemento(int Level, int Points, List<String> PowerUps) {
        this.Level = Level;
        this.Points = Points;
        // Instead of directly assigning the reference (this.PowerUps = PowerUps), it creates a new
        // ArrayList with the same contents. This is crucial because:
        // Prevents external modification: Changes to the original list won't affect the memento
        this.PowerUps = new ArrayList<>(PowerUps); // Creates a defensive copy of the PowerUps list
    }
}

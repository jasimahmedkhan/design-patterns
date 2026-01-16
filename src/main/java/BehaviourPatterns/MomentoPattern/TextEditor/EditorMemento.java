package BehaviourPatterns.MomentoPattern.TextEditor;

public class EditorMemento {

    public String Content; // The actual text snapshot

    // What it does: This is like a photograph - it captures what your text looks like at one moment in time.
    public EditorMemento(String Content){
        this.Content = Content; // Store the text exactly as it is now
    }

}

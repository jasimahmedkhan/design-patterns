package BehaviourPatterns.MomentoPattern.TextEditor;

/* What it does:
SaveState() = Taking a photo of your current text
RestoreState() = Looking at an old photo and copying it back
*/
public class TextEditor {

    public String Content; // Current text you're typing

    // Take a "photo" of the current state
    public EditorMemento saveState(){
        return new EditorMemento(Content); // Create snapshot
    }

    // Go back to an old "photo"
    public void restoreState(EditorMemento memento)
    {
        Content = memento.Content; // Copy text from the snapshot back
    }

}

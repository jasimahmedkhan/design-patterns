package BehaviourPatterns.MomentoPattern.TextEditor;

import java.util.Stack;

/*
What it does:
Save() = Put a new photo in your album
Undo() = Pull out the last photo you saved
*/
public class EditorHistory {

    private Stack<EditorMemento> _history = new Stack<>();  // Stack of photos

    public void Save(TextEditor editor){
        _history.push(editor.saveState()); // Put a photo on top of the stack
    }

    public EditorMemento Undo(){
        if(!_history.isEmpty())
            return _history.pop(); // Take photo from top of stack
        System.out.println("No more text to undo");
        return null;
    }

}

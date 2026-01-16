package BehaviourPatterns.MomentoPattern.TextEditor;

public class Main {

    static void main() {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.Content = "Hello World";
        history.Save(editor);

        editor.Content = "Hello Java";
        history.Save(editor);

        editor.Content = "Hello C#";


        // Undo to previous state
        editor.restoreState(history.Undo());
        System.out.println(editor.Content);
    }

}

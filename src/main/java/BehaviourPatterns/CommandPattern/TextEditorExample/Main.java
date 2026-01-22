package BehaviourPatterns.CommandPattern.TextEditorExample;

// Client
public class Main {

    static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CommandManager manager = new CommandManager();
        manager.ExecuteCommand(new InsertCommand(textEditor, "Hello World "));
        manager.ExecuteCommand(new InsertCommand(textEditor, "Hello Java "));

        System.out.println("Undo...");
        manager.Undo();

        System.out.println("Redo...");
        manager.Redo();


    }
}

package BehaviourPatterns.CommandPattern.TextEditorExample;

// Concrete Command
public class InsertCommand implements ICommand {

    // Receiver
    private TextEditor textEditor;
    private String text;

    public InsertCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void Execute() {
        textEditor.AppendText(text);
    }

    @Override
    public void Undo() {
        textEditor.DeleteText(text.length());
    }
}

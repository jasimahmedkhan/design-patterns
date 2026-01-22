package BehaviourPatterns.CommandPattern.TextEditorExample;

// Concrete Command
public class DeleteCommand implements ICommand {

    // Receiver
    private TextEditor textEditor;
    private int length;
    private String deletedText;

    public DeleteCommand(TextEditor textEditor, int length) {
        this.textEditor = textEditor;
        this.length = length;
    }

    @Override
    public void Execute() {
        deletedText = textEditor.DeleteText(length);
    }

    @Override
    public void Undo() {
        textEditor.AppendText(deletedText);
    }
}

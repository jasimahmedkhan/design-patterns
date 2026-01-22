package BehaviourPatterns.CommandPattern.TextEditorExample;

// Defines the Command Interface, that includes Execution style aspects of work
public interface ICommand {
    void Execute();
    void Undo();
}

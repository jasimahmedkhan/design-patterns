package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

public interface ICommand {
    void Execute();
    void Undo();
}

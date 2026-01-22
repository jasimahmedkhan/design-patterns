package BehaviourPatterns.CommandPattern.RemoteControlExample;

public interface ICommand {
    void Execute();
    void Undo();
}

package BehaviourPatterns.CommandPattern.RemoteControlExample;

import java.util.Stack;

public class RemoteControl {

    private Stack<ICommand> commandHistory = new Stack<>();

    public void ExecuteCommand(ICommand command){
        command.Execute();
        commandHistory.push(command);
    }

    public void Undo(){
        if (!commandHistory.isEmpty()){
            ICommand command = commandHistory.pop();
            command.Undo();
        }
    }

}

package BehaviourPatterns.CommandPattern.TextEditorExample;

import java.util.Stack;

// Invoker - Manages Command History
public class CommandManager {

    private Stack<ICommand> history = new Stack<>();
    private Stack<ICommand> undoHistory = new Stack<>();

    public void ExecuteCommand(ICommand command){
        command.Execute();
        history.push(command);
        undoHistory.clear();
    }

    public void Undo(){
        if (!history.isEmpty()){
            ICommand command = history.pop();
            command.Undo();
            undoHistory.push(command);
        }
        else
            System.out.println("No more commands to undo");
    }

    public void Redo(){
        if (!undoHistory.isEmpty()){
            ICommand command = undoHistory.pop();
            command.Execute();
            history.push(command);
        }
        else
            System.out.println("No more commands to redo");
    }

}

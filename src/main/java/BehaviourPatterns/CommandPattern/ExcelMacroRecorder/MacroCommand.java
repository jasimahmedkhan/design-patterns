package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

import java.util.ArrayList;
import java.util.List;

// Composite Command - Can hold multiple commands
public class MacroCommand implements ICommand {

    private List<ICommand> commands = new ArrayList<>();
    public String macroName;

    public MacroCommand(String macroName) {
        this.macroName = macroName;
    }

    // Add individual commands to the macro
    public void AddCommand(ICommand command) {
        commands.add(command);
    }

    // Execute all commands in sequence
    @Override
    public void Execute() {
        System.out.println("Executing macro: " + macroName);
        for (ICommand command : commands) {
            command.Execute();
        }

    }

    // Undo all commands in reverse order
    @Override
    public void Undo() {
        System.out.println("Undoing macro: " + macroName);
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).Undo();
        }

    }
}

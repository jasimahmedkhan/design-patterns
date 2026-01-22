package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

import java.util.HashMap;

public class MacroRecorder {
    private MacroCommand macroCommand;
    private boolean isRecording = false;
    private HashMap<String, MacroCommand> savedMacros;

    public MacroRecorder(){
        savedMacros = new HashMap<>();
    }
    public void StartRecording(String macroName){
        macroCommand = new MacroCommand(macroName);
        isRecording = true;
        System.out.println("Recording started");
    }

    public void StartRecording(ICommand command) {
        if (isRecording && macroCommand != null) {
            macroCommand.AddCommand(command);
            System.out.println("Command added to macro");
        }
    }

    public void StopRecording(){
        if (isRecording && macroCommand != null){
            String macroName = macroCommand.macroName;
            savedMacros.put(macroName, macroCommand);
            System.out.println("Recording stopped");
            isRecording = false;
        }
    }

    public void PlayMacro(String macroName){

        if(savedMacros.get(macroName) != null){
            System.out.println("Playing macro: " + macroName);
            savedMacros.get(macroName).Execute();
        }
    }


}

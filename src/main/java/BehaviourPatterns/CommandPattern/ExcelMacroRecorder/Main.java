package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

public class Main {

    static void main() {

        // Usage Example
        SpreadSheet sheet = new SpreadSheet();
        MacroRecorder recorder = new MacroRecorder();
        MacroCommand macro = new MacroCommand("My Macro");

        // User starts recording
        recorder.StartRecording("FormatMonthlyReport");

        // User performs actions (each is recorded)
        macro.AddCommand(new SelectCellCommand(sheet, "A1"));
        macro.AddCommand(new EnterTextCommand(sheet, "Hello World"));
        recorder.StartRecording(new SelectCellCommand(sheet, "A1"));
        recorder.StartRecording(new EnterTextCommand(sheet, "Monthly Sales Report"));
        recorder.StartRecording(new FormatCellCommand(sheet, "A1", "Bold", "14pt"));
        recorder.StartRecording(new SelectCellCommand(sheet, "A2"));
        recorder.StartRecording(new EnterTextCommand(sheet, "January 2026"));

        // User stops recording
        recorder.StopRecording();

        // Later, user can replay the entire sequence
        recorder.PlayMacro("FormatMonthlyReport");
        System.out.println("Done!");

    }
}

package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

public class EnterTextCommand implements ICommand{

    private SpreadSheet sheet;
    private String text;
    private String previousText;

    public EnterTextCommand(SpreadSheet sheet, String text){
        this.sheet = sheet;
        this.text = text;
    }


    @Override
    public void Execute() {
        previousText = sheet.getCellValue(sheet.selectedCell);
        sheet.setCellValue(sheet.selectedCell, text);
        System.out.println("Entered text: " + text);

    }

    @Override
    public void Undo() {
        sheet.setCellValue(sheet.selectedCell, previousText);
        System.out.println("Text reverted to: " + previousText);
    }
}



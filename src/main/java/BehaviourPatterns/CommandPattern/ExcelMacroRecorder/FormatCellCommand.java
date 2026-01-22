package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;


public class FormatCellCommand implements ICommand {
    private SpreadSheet sheet;
    private String cellAddress;
    private String format;
    private String previousFormat;

    public FormatCellCommand(SpreadSheet sheet, String format, String cellAddress, String previousFormat) {
        this.format = format;
        this.sheet = sheet;
        this.cellAddress = cellAddress;
        this.previousFormat = previousFormat;
    }

    public void Execute() {
        previousFormat = sheet.GetCellFormat(cellAddress);
        sheet.SetCellFormat(cellAddress, format);
        System.out.println("Cell format changed to: " + format);
    }

    public void Undo() {
        sheet.SetCellFormat(cellAddress, previousFormat);
        System.out.println("Cell format changed back to: " + previousFormat);
    }
}

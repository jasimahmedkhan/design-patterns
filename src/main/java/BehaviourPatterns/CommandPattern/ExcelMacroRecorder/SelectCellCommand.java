package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectCellCommand implements ICommand{

    private SpreadSheet sheet;
    private String cellAddress;
    private String previousCell;

    public SelectCellCommand(SpreadSheet sheet, String cellAddress){
        this.sheet = sheet;
        this.cellAddress = cellAddress;
    }

    @Override
    public void Execute() {
        previousCell = sheet.selectedCell;
        sheet.selectedCell = cellAddress;
        System.out.println("Selected cell: " + cellAddress);
    }

    @Override
    public void Undo() {
        sheet.SelectCell(previousCell);
        System.out.println("Cell selected: " + previousCell);

    }
}

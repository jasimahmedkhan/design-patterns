package BehaviourPatterns.CommandPattern.ExcelMacroRecorder;

public class SpreadSheet {

    public String selectedCell;

    public SpreadSheet(){
        selectedCell = "";
    }

    public void SelectCell(String cellAddress){
        selectedCell = cellAddress;
        System.out.println("Cell selected: " + cellAddress);
    }

    public String getCellValue(String selectedCell) {
        return selectedCell;
    }

    public void setCellValue(String selectedCell, String text) {
        this.selectedCell = text;
        System.out.println("Cell " + selectedCell + " value set to: " + text);
    }

    public String GetCellFormat(String cellAddress) {
        return cellAddress;
    }

    public void SetCellFormat(String cellAddress, String format) {
        System.out.println("Cell " + cellAddress + " format set to: " + format);
    }
}

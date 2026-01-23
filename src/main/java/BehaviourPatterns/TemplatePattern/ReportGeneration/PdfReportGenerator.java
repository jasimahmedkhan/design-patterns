package BehaviourPatterns.TemplatePattern.ReportGeneration;

public class PdfReportGenerator extends ReportGenerator{
    @Override
    protected String formatReport(Object data) {
        return "PDF Content: " + data;
    }

    @Override
    protected void deliverReport(String report) {
        System.out.println("Sending report via PDF: " + report);
    }
}

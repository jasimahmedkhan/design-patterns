package BehaviourPatterns.TemplatePattern.ReportGeneration;

public class EmailReportGenerator extends ReportGenerator{
    @Override
    protected String formatReport(Object data) {
        return "<html><body>Report: " + data + "</body></html>";
    }

    @Override
    protected void deliverReport(String report) {
        System.out.println("Sending report via email");
    }
}

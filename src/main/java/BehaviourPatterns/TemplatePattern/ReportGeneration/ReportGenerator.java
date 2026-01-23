package BehaviourPatterns.TemplatePattern.ReportGeneration;

import java.time.LocalDateTime;

// Abstract base class for report generation
public abstract class ReportGenerator {
    
    // Template Method - defines algorithm skeleton (final and sealed to prevent overrides)
    public final void generateReport(){
        
        connectToDatabase();
        var data = fetchData();
        var report = formatReport(data);
        deliverReport(report);
        closeConnection();
        
    }

    private void connectToDatabase() {
        System.out.println("Connecting to database...");
        System.out.println("Connection is opened!");
    }
    
    private Object fetchData() {
        System.out.println("Fetching data from database...");
        return "Sales Data from " + LocalDateTime.now();
    }

    protected abstract String formatReport(Object data);

    protected abstract void deliverReport(String report);

    private void closeConnection() {
        System.out.println("Closing database connection...");
    }
}
    

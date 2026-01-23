package BehaviourPatterns.TemplatePattern.DataProcessor;

// Abstract base class for data processing operations
public abstract class DataProcessor {

    // Template method - Defines algorithm skeleton (final and sealed to prevent overrides)
    public final void processData(String filePath){
        // Fixed sequence of operations
        var rawData = readData(filePath);               // Step 1
        var validatedData = validateData(rawData);      // Step 2 - Varies by type
        if (validatedData) {
            var transformedData = transformData(rawData); // Step 3 - Transformation - Varies by type
            saveData(transformedData);                    // Step 4 - Save data
            logSuccess();                                 // Step 5 - Logging success - Hook Method
        }
        else {
            System.out.println("Data validation failed");
            logFailure();
        }
    }

    // Concrete method - same for all subclasses
    private String readData(String filepath){
        System.out.println("Reading data from file: " + filepath);
        return filepath;
    }

    // Abstract methods - must be implemented by subclasses
    protected abstract boolean validateData(String rawData);
    protected abstract String transformData(String validData);

    // Concrete method - same for all subclasses
    private void saveData(String transformedData){
        System.out.println("Saving data to database: " + transformedData);
    }

    // Virtual or Hook method - optional override (has default implementation)
    protected void logSuccess(){
        System.out.println("Data processing completed successfully");
    }

    private void logFailure() {
        System.out.println("Data processing failed");
    }

}





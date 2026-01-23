package BehaviourPatterns.TemplatePattern.DataProcessor;

public class CsvDataProcessor extends DataProcessor{


    @Override
    protected boolean validateData(String rawData) {
        System.out.println("Validating CSV format");
        return rawData.contains(","); // Simple CSV validation (returning same data for simplicity)
    }

    @Override
    protected String transformData(String validData) {
        System.out.println("Transforming CSV data");
        var transformedData = validData.replace(",", "|");// CSV to pipe-delimited
        System.out.println("Transformed CSV data: " + transformedData);
        return transformedData;
    }
}

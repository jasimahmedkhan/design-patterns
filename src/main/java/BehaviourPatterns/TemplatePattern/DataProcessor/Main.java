package BehaviourPatterns.TemplatePattern.DataProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Processing JSON Data ---");
        DataProcessor jsonProcessor = new JsonDataProcessor();
        String jsonInput = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        jsonProcessor.processData(jsonInput);

        DataProcessor csvProcessor = new CsvDataProcessor();
        String csvInput = "John,30,New York";
        csvProcessor.processData(csvInput);

    }
}

package BehaviourPatterns.TemplatePattern.DataProcessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonDataProcessor extends DataProcessor {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected boolean validateData(String rawData) {
        System.out.println("Validating JSON format");
        return rawData.startsWith("{") && rawData.endsWith("}");
    }

    @Override
    protected String transformData(String validData) {
        System.out.println("Transforming JSON data");
        try {
            // Deserializing to an Object (could be a Map or List depending on JSON)
            Object obj = objectMapper.readValue(validData, Object.class);
            // Re-serializing with formatting
            String transformedData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println("Transformed CSV data: " + transformedData);
            return transformedData;
        } catch (JsonProcessingException e) {
            System.err.println("Error during JSON transformation: " + e.getMessage());
            return validData;
        }
    }

    @Override
    protected void logSuccess() {
        System.out.println("JSON data processing successful");
    }

}

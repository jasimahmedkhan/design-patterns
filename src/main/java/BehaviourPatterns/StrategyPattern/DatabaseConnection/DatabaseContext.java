package BehaviourPatterns.StrategyPattern.DatabaseConnection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseContext {
    private IDatabaseStrategy _strategy;

    public DatabaseContext(@Value("${database.type}") String dbType) {
        switch (dbType) {
            case "SqlServer":
                _strategy = new SqlServerStrategy();
                break;
            case "Postgres":
                _strategy = new PostgresStrategy();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
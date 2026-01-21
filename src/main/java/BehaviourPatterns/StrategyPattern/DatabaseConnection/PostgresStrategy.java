package BehaviourPatterns.StrategyPattern.DatabaseConnection;

import java.sql.Connection;

public class PostgresStrategy implements IDatabaseStrategy {
    @Override
    public Connection GetConnection() {
        return null;
    }
}

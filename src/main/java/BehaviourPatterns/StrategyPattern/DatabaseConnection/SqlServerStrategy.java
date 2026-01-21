package BehaviourPatterns.StrategyPattern.DatabaseConnection;

import java.sql.Connection;

public class SqlServerStrategy implements IDatabaseStrategy {
    @Override
    public Connection GetConnection() {
        return null;
    }
}

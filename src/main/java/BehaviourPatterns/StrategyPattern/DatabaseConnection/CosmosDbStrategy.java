package BehaviourPatterns.StrategyPattern.DatabaseConnection;

import java.sql.Connection;

public class CosmosDbStrategy implements IDatabaseStrategy {
    @Override
    public Connection GetConnection() {
        return null;
    }
}

package BehaviourPatterns.StrategyPattern.DatabaseConnection;

import java.sql.Connection;

public class MongoDbStrategy implements IDatabaseStrategy {
    @Override
    public Connection GetConnection() {
        return null;
    }
}

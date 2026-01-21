package BehaviourPatterns.StrategyPattern.DatabaseConnection;

import java.sql.Connection;

public interface IDatabaseStrategy {
    Connection GetConnection();
}

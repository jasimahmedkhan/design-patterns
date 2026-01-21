package BehaviourPatterns.StrategyPattern.AuthenticationSystem;

public class ApiKeyStrategy implements IAuthStrategy {
    @Override
    public boolean Authenticate(String credential) {
        return false;
    }
}

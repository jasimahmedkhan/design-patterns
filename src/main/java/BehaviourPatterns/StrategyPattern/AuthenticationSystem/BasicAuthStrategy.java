package BehaviourPatterns.StrategyPattern.AuthenticationSystem;

public class BasicAuthStrategy implements IAuthStrategy {
    @Override
    public boolean Authenticate(String credential) {
        return false;
    }
}

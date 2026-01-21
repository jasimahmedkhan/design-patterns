package BehaviourPatterns.StrategyPattern.AuthenticationSystem;

public class OAuth2Strategy implements IAuthStrategy {
    @Override
    public boolean Authenticate(String credential) {
        return false;
    }
}

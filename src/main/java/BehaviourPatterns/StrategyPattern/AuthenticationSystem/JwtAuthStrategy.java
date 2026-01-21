package BehaviourPatterns.StrategyPattern.AuthenticationSystem;

public class JwtAuthStrategy implements IAuthStrategy{
    @Override
    public boolean Authenticate(String credential) {
        return false;
    }
}

package BehaviourPatterns.StrategyPattern.AuthenticationSystem;

public interface IAuthStrategy {
    boolean Authenticate(String credential);
}



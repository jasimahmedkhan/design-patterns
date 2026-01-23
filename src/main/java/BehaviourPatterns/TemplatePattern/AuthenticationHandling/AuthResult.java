package BehaviourPatterns.TemplatePattern.AuthenticationHandling;

public class AuthResult {
    public static final boolean Failed = false;

    public static boolean Success(Object token) {
        return true;
    }
}

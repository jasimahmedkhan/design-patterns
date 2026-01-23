package BehaviourPatterns.TemplatePattern.AuthenticationHandling;

import com.sun.net.httpserver.HttpContext;

import java.util.List;

public abstract class AuthenticationHandler {

    public final boolean Authenticate(HttpContext context){
        var credentials = extractCredentials(context); // Hook
        var user = validateCredentials(credentials); // Hook

        if (user == null) return AuthResult.Failed;

        var claims = buildClaims(user); // Hook
        var token = generateToken(claims); // Common

        return AuthResult.Success(token);
    }

    private Object generateToken(List<Claim> claims) {
        return null;
    }


    protected abstract Credentials extractCredentials(HttpContext context);
    protected abstract User validateCredentials(Credentials credentials);
    protected abstract List<Claim> buildClaims(User user);
}

package BehaviourPatterns.StrategyPattern.AuthenticationSystem;

import com.sun.net.httpserver.HttpContext;

import java.util.Map;

public class AuthenticationMiddleware {

    public boolean invokeAsync(HttpContext context) {
        IAuthStrategy strategy = determineAuthStrategy(context.getAttributes());
        boolean isAuthenticated = strategy.Authenticate(getCredentials(context));
        System.out.println("User is authenticated: " + isAuthenticated);
        return isAuthenticated;
    }

    private String getCredentials(HttpContext context) {
        Map<String, Object> attributes = context.getAttributes();
        String authHeader = (String) attributes.get("Authorization");
        if (authHeader != null && !authHeader.isEmpty()) {
            return authHeader;
        }
        return null;
    }

    private IAuthStrategy determineAuthStrategy(Map<String, Object> attributes) {
        String authType = (String) attributes.get("auth_type");

        if (authType == null) {
            return new BasicAuthStrategy();
        }

        return switch (authType.toLowerCase()) {
            case "basic" -> new BasicAuthStrategy();
            case "jwt" -> new JwtAuthStrategy();
            case "oauth2" -> new OAuth2Strategy();
            case "apikey" -> new ApiKeyStrategy();
            default -> new BasicAuthStrategy();
        };
    }
}
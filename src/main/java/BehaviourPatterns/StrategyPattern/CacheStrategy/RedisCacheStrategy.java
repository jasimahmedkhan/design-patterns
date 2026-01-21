package BehaviourPatterns.StrategyPattern.CacheStrategy;

public class RedisCacheStrategy implements ICacheStrategy<String>{
    @Override
    public String get(String key) {
        return "";
    }

    @Override
    public void set(String key, String value, long expiration) {

    }
}

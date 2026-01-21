package BehaviourPatterns.StrategyPattern.CacheStrategy;

public interface ICacheStrategy<T> {
    T get(String key);

    void set(String key, T value, long expiration);
}
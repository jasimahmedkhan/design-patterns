import java.util.logging.Logger;

public interface IStrategy {
    void Execute();
}

// ❌ PITFALL: Strategies with no shared state management
public abstract static class BadStrategy implements IStrategy {
    public Logger logger = Logger.getLogger(BadStrategy.class.getName());

    public void Execute() {

        // Each strategy duplicates logging, error handling, etc.
        logger.info("Starting");
        try {
            logger.info("check if this works!");
        } catch (Exception e) {
            logger.info("this does not works!");
            throw new RuntimeException(e);
        }
        {
            logger.info("Finished");
        }
    }


    /// / ✅ CORRECT: Template Method + Strategy combination
    public abstract static class BaseStrategy implements IStrategy {
        public Logger logger = Logger.getLogger(BaseStrategy.class.getName());

        public void Execute() {
            logger.info("Starting");
            try {
                logger.info("check if this works!");
                ExecuteCore(); // Concrete strategy implements this
            } catch (Exception ex) {
                HandleError(ex);
            }
            logger.info("Finished");
        }


        protected abstract void ExecuteCore();
        protected abstract void HandleError(Exception ex);
    }

}

public class ShippingStrategy extends BadStrategy.BaseStrategy {

    @Override
    protected void ExecuteCore() {

    }

    @Override
    protected void HandleError(Exception ex) {

    }
}

void main() {
}

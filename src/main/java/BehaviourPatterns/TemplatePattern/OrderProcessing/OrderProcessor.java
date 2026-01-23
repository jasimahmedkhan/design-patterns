package BehaviourPatterns.TemplatePattern.OrderProcessing;

// Template Class - defines skeleton of algorithm
public abstract class OrderProcessor {

    public final void processOrder(Order order){
        System.out.println("Processing order..." + order.OrderId);

        // Fixed Workflow
        validateOrder(order);
        checkInventory(order);
        var payment = processPayment(order);
        reserveItems(order);
        shipOrder(order);
        sendConfirmation(order);

    }


    private void validateOrder(Order order) {
        if(order.Items.isEmpty())
            throw new IllegalArgumentException("Empty order - Order must contain at least one item");
    }

    // Abstract methods - must be implemented
    protected abstract void checkInventory(Order order);
    protected abstract void reserveItems(Order order);
    protected abstract Object processPayment(Order order);
    protected abstract void shipOrder(Order order);

    // Hook method - optional override
    protected void sendConfirmation(Order order) {
        System.out.println("Order " + order.OrderId + " shipped successfully!");
    }





}

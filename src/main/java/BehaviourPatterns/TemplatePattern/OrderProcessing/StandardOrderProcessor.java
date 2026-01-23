package BehaviourPatterns.TemplatePattern.OrderProcessing;

public class StandardOrderProcessor extends OrderProcessor{
    @Override
    protected void checkInventory(Order order) {
        System.out.println("Checking inventory for order " + order.OrderId);
    }

    @Override
    protected void reserveItems(Order order) {
        System.out.println("Reserving items for order " + order.OrderId);
    }

    @Override
    protected Object processPayment(Order order) {
        System.out.println("Processing payment for order " + order.OrderId);
        return true;
    }

    @Override
    protected void shipOrder(Order order) {
        System.out.println("Shipping order " + order.OrderId);
    }
}

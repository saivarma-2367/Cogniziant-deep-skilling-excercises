package Excercise8;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected.");
        } else {
            strategy.pay(amount);
        }
    }
}

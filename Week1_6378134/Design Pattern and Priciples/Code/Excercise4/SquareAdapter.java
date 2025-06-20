package Excercise4;

public class SquareAdapter implements PaymentProcessor {
    private SquarePayment squarePayment;

    public SquareAdapter(SquarePayment squarePayment) {
        this.squarePayment = squarePayment;
    }

    @Override
    public void processPayment(double amount) {
        squarePayment.executePayment(amount);
    }
}

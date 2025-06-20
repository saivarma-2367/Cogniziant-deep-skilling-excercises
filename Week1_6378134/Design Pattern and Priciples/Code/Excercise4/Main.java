package Excercise4;

public class Main {
   public static void main(String[] args) {
        PayPalPayment paypal = new PayPalPayment();
        StripePayment stripe = new StripePayment();
        SquarePayment square = new SquarePayment();

        PaymentProcessor paypalAdapter = new PayPalAdapter(paypal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        PaymentProcessor squareAdapter = new SquareAdapter(square);

        paypalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
        squareAdapter.processPayment(300.0);
    }
}

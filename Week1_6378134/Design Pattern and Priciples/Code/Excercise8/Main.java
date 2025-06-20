package Excercise8;

public class Main {
  public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Sai Varma");
        context.setPaymentStrategy(creditCard);
        context.processPayment(1500.0);

        PaymentStrategy paypal = new PayPalPayment("sai@example.com");
        context.setPaymentStrategy(paypal);
        context.processPayment(2000.0);
    }
}

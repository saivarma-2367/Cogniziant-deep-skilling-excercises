package Excercise5;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}

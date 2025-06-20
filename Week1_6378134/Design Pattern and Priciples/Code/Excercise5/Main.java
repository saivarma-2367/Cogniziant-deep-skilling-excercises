package Excercise5;

public class Main {
  public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        Notifier fullNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        fullNotifier.send("Hello! This is your notification.");
    }
}

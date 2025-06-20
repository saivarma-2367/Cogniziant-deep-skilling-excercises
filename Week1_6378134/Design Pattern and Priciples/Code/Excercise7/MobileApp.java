package Excercise7;

public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println(appName + " - New price for " + stockName + ": ₹" + newPrice);
    }
}
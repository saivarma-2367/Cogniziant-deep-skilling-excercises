package Excercise7;

public class WebApp implements Observer {
    private String webClient;

    public WebApp(String webClient) {
        this.webClient = webClient;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println(webClient + " - Updated price for " + stockName + ": ₹" + newPrice);
    }
}
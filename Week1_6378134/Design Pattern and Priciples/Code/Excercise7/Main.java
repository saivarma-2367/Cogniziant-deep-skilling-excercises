package Excercise7;

public class Main {
  public static void main(String[] args) {
        StockMarket stock = new StockMarket("TATA", 720.0);

        Observer mobileApp = new MobileApp("StockBuddy");
        Observer webApp = new WebApp("StockWatch");

        stock.registerObserver(mobileApp);
        stock.registerObserver(webApp);

        stock.setStockPrice(725.5);
        stock.setStockPrice(738.0);

        stock.removeObserver(webApp);
        stock.setStockPrice(750.0);
    }
}

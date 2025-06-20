package Excercise7;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public void setStockPrice(double price) {
        System.out.println("\nStock price updated for " + stockName + ": " + price);
        this.stockPrice = price;
        notifyObservers();
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(stockName, stockPrice);
        }
    }
}
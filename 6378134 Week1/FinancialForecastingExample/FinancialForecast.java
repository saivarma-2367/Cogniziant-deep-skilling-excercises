package FinancialForecastingExample;

public class FinancialForecast {

    public static double forecast(double initialAmount, double rate, int years) {
        if (years == 0) {
            return initialAmount;
        }

        return forecast(initialAmount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000;
        double annualGrowthRate = 0.05;
        int years = 10;

        double futureValue = forecast(initialAmount, annualGrowthRate, years);

        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}


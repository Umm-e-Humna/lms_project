package com.hitms.lab02;

public class PriceUtils {

    /**
     * Calculates the total of all prices.
     *
     * @param prices array of prices
     * @return total sum of prices
     */
    public static double total(double[] prices) {
        double sum = 0;

        // Add each price to the running total.
        for (double price : prices) {
            sum += price;
        }

        return sum;
    }

    /**
     * Calculates the average of all prices.
     *
     * @param prices array of prices
     * @return average price
     */
    public static double average(double[] prices) {
        return total(prices) / prices.length;
    }
    public static void main(String[] args) {
    double[] prices = {100.0, 200.0, 300.0};

    System.out.println("Total: " + total(prices));
    System.out.println("Average: " + average(prices));
}
}
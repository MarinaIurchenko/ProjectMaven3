package ru.netology.stats;

import java.io.OptionalDataException;

public class StatsService {
    public int allEquals(int[] sales) {
        int sum = 0;
        for (int number : sales) {
            {
                sum = sum + number;
            }
        }
        return sum;
    }

    public int averageEquals(int[] sales) {
        int averageSales = allEquals(sales);
        return averageSales / sales.length;
    }


    public int minMonthEquals(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }

    public int maxMonthEquals(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int monthlySalesBelowAverage(int[] sales) {
        int month = 0;
        for (int number : sales)
            if (number < averageEquals(sales)) {
                month = month + 1;
            }
        return month;
    }

    public int equalsAverageAbove(int[] sales) {
        int month = 0;
        for (int number : sales)
            if (number > averageEquals(sales)) {
                month = month + 1;
            }
        return month;
    }
}



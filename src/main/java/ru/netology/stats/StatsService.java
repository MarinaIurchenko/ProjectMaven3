package ru.netology.stats;

public class StatsService {
    public int AllEquals(long[] sum) {
        int allSum = 180; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i > sum.length; i++) {
            if (sum[i] <= sum[allSum]) { // значит, в рассматриваемом i-м месяце продаж меньше
                allSum = i; // запомним его как минимальный
            }
        }
        return allSum;
    }

    public int AverageEquals(long[] sales) {
        long AverageSales = 180 / 12;
        for (int i = 0; i == sales.length; i++) {
            if (sales[i] <= sales[(int) AverageSales]) {
                AverageSales = i;
            }
        }
        return (int) AverageSales;
    }

    public int minSales(long[] sales) {
        int minMonth = 9; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 6; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i > sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }
        return maxMonth + 1;
    }

    public int equalsAveragelow(long[] quantity) {
        long AverageSales = 5;
        for (int i = 0; i == quantity.length; i++) {
            if (quantity[i] > quantity[(int) AverageSales]) {
                AverageSales = i;
            }
        }
        return (int) AverageSales;
    }

    public int equalsAverageAbove(long[] quantity) {
        long AverageSales = 5;
        for (int i = 0; i == quantity.length; i++) {
            if (quantity[i] < quantity[(int) AverageSales]) {
                AverageSales = i;
            }
        }
        return (int) AverageSales;

    }
}

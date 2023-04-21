package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void CountMonthlySalesAll() {
        StatsService service = new StatsService();
        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAll = 180;
        int actualAll = service.AllEquals(sum);

        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test
    void CountMonthlySalesAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service.AverageEquals(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    void CountMonthlySalesMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 7;
        int actualMonth = service.maxMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void CountMonthlySalesMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void CountMonthlySalesBelowAverage() {
        StatsService service = new StatsService();
        long[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedlowAverage = 5;
        int actuallowAverage = service.equalsAveragelow(quantity);

        Assertions.assertEquals(expectedlowAverage, actuallowAverage);

    }

    @Test
    void CountMonthlySalesAboveAverage() {
        StatsService service = new StatsService();
        long[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedlowAverage = 5;
        int actuallowAverage = service.equalsAverageAbove(quantity);

        Assertions.assertEquals(expectedlowAverage, actuallowAverage);
    }
}

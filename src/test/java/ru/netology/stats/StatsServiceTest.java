package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void CountMonthlySalesAll() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAll = 180;
        int actualAll = service.allEquals(sales);

        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test
    void CountMonthlySalesAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service.averageEquals(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }


    @Test
    void CountMonthlySalesMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minMonthEquals(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void CountMonthlySalesMax() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxMonthEquals(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void CountMonthlySalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedlowAverage = 5;
        int actuallowAverage = service.monthlySalesBelowAverage(sales);

        Assertions.assertEquals(expectedlowAverage, actuallowAverage);
    }

    @Test
    void CountMonthlySalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedlowAverage = 5;
        int actuallowAverage = service.equalsAverageAbove(sales);

        Assertions.assertEquals(expectedlowAverage, actuallowAverage);
    }
}

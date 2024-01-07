package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSumOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long result = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, result);

    }

    @Test
    public void shouldAverageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        long result = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expectedSum, result);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long maxMonth = 8;
        long result = service.maxSales(sales);

        Assertions.assertEquals(maxMonth, result);
    }

    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long minMonth = 9;
        long result = service.minSales(sales);

        Assertions.assertEquals(minMonth, result);
    }

    @Test
    public void shouldMonthsSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long months = 5;
        long result = service.monthsSalesBelowAverage(sales);

        Assertions.assertEquals(months, result);
    }

    @Test
    public void shouldMonthsSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long months = 5;
        long result = service.monthsSalesAboveAverage(sales);

        Assertions.assertEquals(months, result);
    }
}

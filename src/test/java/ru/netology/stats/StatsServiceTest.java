package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long expected = 180;

        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMiddle() {
        StatsService service = new StatsService();

        long expected = 15;

        long actual = service.calculateMiddleSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFoundNumberMonthWithMaxSale() {
        StatsService service = new StatsService();

        long expected = 8;

        long actual = service.foundNumberMonthInMaxSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFoundNumberMonthWithMinSale() {
        StatsService service = new StatsService();

        long expected = 9;

        long actual = service.foundNumberMonthInMinSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateCountMonthWhereSaleMoreMiddle() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.countMonthWhereSaleMoreMiddle(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateCountMonthWhereSaleLessMiddle() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.countMonthWhereSaleLessMiddle(sales);
        assertEquals(expected, actual);
    }
}

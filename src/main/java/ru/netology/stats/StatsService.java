package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long calculateMiddleSum(long[] sales) {

        long sum = calculateSum(sales);

        return sum / sales.length;

    }

    public long foundNumberMonthInMaxSale(long[] sales) {

        long currentMax = maxSale(sales);
        int numberMonth = 0;
        int numberMonthMax = 0;

        for (long sale : sales) {
            numberMonth += 1;
            if (sale == currentMax) {
                numberMonthMax = numberMonth;
            }
        }
        return numberMonthMax;
    }

    public long maxSale(long[] sales) {
        long currentMax = sales[0];

        for (long sale : sales) {

            if (currentMax < sale) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public long foundNumberMonthInMinSale(long[] sales) {
        long currentMin = minSale(sales);
        int numberMonth = 0;
        int numberMonthMin = 0;

        for (long sale : sales) {
            numberMonth += 1;
            if (sale == currentMin) {
                numberMonthMin = numberMonth;
            }
        }
        return numberMonthMin;
    }

    public long minSale(long[] sales) {
        long currentMin = sales[0];

        for (long sale : sales) {

            if (currentMin > sale) {
                currentMin = sale;
            }
        }
        return currentMin;
    }

    public long countMonthWhereSaleMoreMiddle(long[] sales) {
        long middle = calculateMiddleSum(sales);
        int countMonth = 0;

        for (long sale : sales) {
            if (sale > middle) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public long countMonthWhereSaleLessMiddle(long[] sales) {
        long middle = calculateMiddleSum(sales);
        int countMonth = 0;

        for (long sale : sales) {
            if (sale < middle) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
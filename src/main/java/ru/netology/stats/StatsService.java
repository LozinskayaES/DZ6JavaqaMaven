package ru.netology.stats;

public class StatsService {

    public long sumOfAllSales(long[] sales) {
        //переменая в которой будет хранится сумма
        long sum = 0;
        //бежим по массиву
        for (int i = 0; i < sales.length; i++) {
            //добавляем в переменую текущие значение
            sum = sum + sales[i];
        }
        //возвращаем из метода
        return sum;
    }

    public long averageSalesPerMonth(long[] sales) {
        //получить сумму из метода выше
        long sum = sumOfAllSales(sales);

        //поделить на длину массива и вернуть результат
        return sum / sales.length;
    }

    public long maxSales(long[] sales) {
        // номер месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        // номер месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long monthsSalesBelowAverage(long[] sales) {
        //количество месяцев, в которых продажи были ниже среднего
        int months = 0;
        long averageSales = averageSalesPerMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                months = months + 1;
            }
        }
        return months;
    }

    public long monthsSalesAboveAverage(long[] sales) {
        //количество месяцев, в которых продажи были выше среднего
        int months = 0;
        long averageSales = averageSalesPerMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                months = months + 1;
            }
        }
        return months;
    }
}

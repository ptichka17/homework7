package ru.netology.stats;

public class StatsService {                      //метод суммы всех продаж
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }


    public long averagesum(long[] sales) {       //метод средняя сумма продаж в месяц
        return sum(sales) / sales.length;
    }


    public int maxSale(long[] sales) {    //метод номер месяца, в котором был пик продаж
        int maxMonth = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth + 1;
    }


    public int minSale(long[] sales) {    //метод номер месяца, в котором был минимум продаж
        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;
    }


    public int monthsBelowAverage(long[] sales) { //метод количество месяцев, в которых продажи были ниже среднего
        int counter = 0;
        for (long sale : sales) {
            if (sale < averagesum(sales)) {
                counter++;
            }
        }
        return counter;
    }


     public int monthsHigherAverage(long[] sales) { //метод количество месяцев, в которых продажи были выше среднего
        int counter = 0;
        for (long sale : sales) {
            if (sale > averagesum(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
public class StatsService<month> {

    public int calculateSalesAmount(int[] sales) {//Сумму всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateSalesAverage(int[] sales) {  //средняя сумма продаж
        return calculateSalesAmount(sales) / sales.length;
    }

    public int maxSales(long[] sales) {  //Номер месяца, в котором был пик продаж
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {  //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public double сalculateSalesAverageMonth(int[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        double averageSum = 0;//средняя продажа
        int count = 0; // кол-во месяцев где продажа меньше чем average
        for (int sale : sales) {
            averageSum = averageSum + sale; // считаем сумму всех продаж
        }
        averageSum = averageSum / sales.length;
        for (int sale : sales) {
            if (averageSum > sale)
                count = count + 1;
        }
        return count;
    }

    public int сalculateSalesBelowAverage(int[] salesNumbers) { //Кол-во месяцев, в которых продажи были ниже среднего
        int month = 0;//количество месяцев
        double averageMonth = calculateSalesAverage(salesNumbers);//среднее значение
        for (int salesNumber : salesNumbers) {
            if (salesNumber > averageMonth) {
                month++;
            }
        }
        return month;
    }

    public int сalculateSalesAboveAverage(int[] salesNumbers) { //Кол-во месяцев, в которых продажи были выше среднего
        int month = 0;//количество месяцев
        double averageMonth = calculateSalesAverage(salesNumbers);//среднее значение
        for (int salesNumber : salesNumbers) {
            if (salesNumber < averageMonth) {
                month++;
            }
        }
        return month;
    }

    public double сalculateNumberMonthsSaleAboveAaverage(int[] sales) { //Кол-во месяцев, в которых продажи были выше среднего
        double averageSum = 0;//средняя продажа
        int count = 0; // кол-во месяцев где продажа меньше чем average
        for (int sale : sales) {
            averageSum = averageSum + sale; // считаем сумму всех продаж
        }
        averageSum = averageSum / sales.length;
        for (int sale : sales) {
            if (averageSum < sale)
                count = count + 1;
        }
        return count;
    }

    public int calculateFindMax(int[] sales) {    //max сумма
        int maxMonth = sales[0];
        for (int sale : sales) {
            if (sale > maxMonth) {
                maxMonth = sale;
            }
        }
        return maxMonth;
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {  //сумма всех продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSalesAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {  //средняя сумма продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateSalesAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {  //Номер месяца, в котором был пик продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSales() {  //Номер месяца, в котором был минимум продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSalesAverageMonth() {  //Кол-во месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 5;

        double actual = service.сalculateSalesAverageMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateсalSalesBelowAverage() {  //Кол-во месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.сalculateSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateсalSalesAboveAverage() {  //Кол-во месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.сalculateSalesAboveAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberMonthsSaleAboveAaverage() {  //Кол-во месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 5;

        double actual = service.сalculateNumberMonthsSaleAboveAaverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonth() {  //max sum
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;

        int actual = service.calculateFindMax(sales);

        assertEquals(expected, actual);
    }
}


package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestTimeServiceTest {

    @Test
    public void shouldCalculateRestTimeForLittleIncome() {
        //подготавливаем данные
        RestTimeService service = new RestTimeService();

        //вызываем целевой метод:
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRestTimeIncomeBiger() {
        //подготавливаем данные
        RestTimeService service = new RestTimeService();


        // подготавливаем данные и вызываем целевой метод с вводом дaнных:
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


}

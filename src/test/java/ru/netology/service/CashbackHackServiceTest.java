package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    void shouldReturnCorrectRemainWhenAmountIsZero(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }
    @Test
    void ShouldReturnCorrectWhenNegativeNumber(){
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnCorrectRemainWhenAmountIsLessThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnCorrectRemainWhenAmountIsMoreThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnZeroIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        // Then
        Assert.assertEquals(actual, expected);
    }
}

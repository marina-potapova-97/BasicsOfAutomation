package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCorrectRemainWhenAmountIsZero(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnCorrectRemainWhenAmountIsLessThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCorrectRemainWhenAmountIsMoreThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnZeroIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        // Then
        Assert.assertEquals(expected,actual);
    }
}


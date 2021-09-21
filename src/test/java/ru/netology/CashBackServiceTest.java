package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {
    CashBackService cashback = new CashBackService();

    @Test
    public void cashbackMoreThenThousand() {
        int amount = 1500;
        int expected = 500;
        int actual = cashback.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackLessThenThousand() {
        int amount = 700;
        int expected = 300;
        int actual = cashback.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackNoMore(){
        int amount = 1000;
        int expected = 0;
        int actual = cashback.remain(amount);
        assertEquals(expected, actual);
    }
}
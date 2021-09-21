package ru.netology;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

import static org.testng.Assert.*;


public class CashBackServiceTest {
    CashBackService cashback = new CashBackService();

    @Test
    public void cashbackMoreThenThousand() {
        int amount = 1999;
        int actual = cashback.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void cashbackLessThenThousand(){
        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void cashbackNoMore(){
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
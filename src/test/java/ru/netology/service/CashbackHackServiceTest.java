package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }


    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1901;
        int expected = 99;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2450;
        int expected = 550;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
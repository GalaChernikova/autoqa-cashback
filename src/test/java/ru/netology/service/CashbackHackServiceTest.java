package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {
    @Test
    public void shouldCalcValid() {
    CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        assertEquals(actual, 500);
    }

    @Test
    public void shouldCalcValidMin() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        assertEquals(actual, 1000);
    }

    @Test
    public void shouldCalcValidMax() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        assertEquals(actual, 0);
    }

    @Test
    public void shouldCalcValidMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1700);
        assertEquals(actual, 300);
    }
}
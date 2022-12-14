package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void shouldCalcValid() {
    CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        assertEquals(500, actual);
    }

    @Test
    public void shouldCalcValidMin() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        assertEquals(1000, actual);
    }

    @Test
    public void shouldCalcValidMax() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        assertEquals(0, actual);
    }

    @Test
    public void shouldCalcValidMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1700);
        assertEquals(300, actual);
    }
}
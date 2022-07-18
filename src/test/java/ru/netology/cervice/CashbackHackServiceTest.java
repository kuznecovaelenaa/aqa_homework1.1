package ru.netology.cervice;

import org.junit.Test;
import static org.junit.Assert. *;

public class CashbackHackServiceTest{

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = 100;
        int amount = 900;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = 0;
        int amount = 1000;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int actual = 50;
        int amount = 5950;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }
}
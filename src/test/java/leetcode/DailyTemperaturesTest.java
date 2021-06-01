package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    @Test
    public void testCase1() {
        DailyTemperatures sol = new DailyTemperatures();
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},sol.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

}
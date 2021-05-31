package leedcodeeasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumTest {
    @Test
    public void testCase1() {
        RunningSum sol = new RunningSum();
        assertArrayEquals(new int[]{1,3,6,10},sol.runningSum(new int[]{1,2,3,4}) );
    }

}
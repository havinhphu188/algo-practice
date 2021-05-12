package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {
    @Test
    public void testCase1() {
        HouseRobber sol = new HouseRobber();
        int[] input = new int[]{1,2,3,1};
        assertEquals(4, sol.rob(input));
    }

    @Test
    public void testCase2() {
        HouseRobber sol = new HouseRobber();
        int[] input = new int[]{2,7,9,3,1};
        assertEquals(12, sol.rob(input));
    }
}
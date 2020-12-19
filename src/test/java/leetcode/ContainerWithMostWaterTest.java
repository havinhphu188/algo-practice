package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    public void testCase1() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] input = new int[]{4,3,2,1,4};
        int output = 16;
        assertEquals(output, containerWithMostWater.maxArea(input));
    }

}
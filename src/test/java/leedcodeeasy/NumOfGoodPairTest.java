package leedcodeeasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfGoodPairTest {
    @Test
    public void testCase1() {
        NumOfGoodPair sol = new NumOfGoodPair();
        assertEquals(4, sol.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    @Test
    public void testCase2() {
        NumOfGoodPair sol = new NumOfGoodPair();
        assertEquals(6, sol.numIdenticalPairs(new int[]{1,1,1,1}));
    }

    @Test
    public void testCase3() {
        NumOfGoodPair sol = new NumOfGoodPair();
        assertEquals(0, sol.numIdenticalPairs(new int[]{1,2,3}));
    }

}
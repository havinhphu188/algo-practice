package leedcodeeasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStoneTest {
    @Test
    public void testCase1() {
        JewelsAndStone sol = new JewelsAndStone();
        assertEquals(3, sol.numJewelsInStones("Aa", "aAAbbbb"));
    }

}
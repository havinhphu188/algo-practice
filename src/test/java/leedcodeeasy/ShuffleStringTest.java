package leedcodeeasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {
    @Test
    public void testCase1() {
        ShuffleString sol = new ShuffleString();
        assertEquals( "leetcode", sol.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

}
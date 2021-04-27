package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {
    DecodeWays decodeWays = new DecodeWays();

    @Test
    public void testCase1() {
        int out = decodeWays.numDecodings("11106");
        assertEquals(2, out);
    }

    @Test
    public void testCase2() {
        int out = decodeWays.numDecodings("226");
        assertEquals(3, out);
    }

    @Test
    public void testCase3() {
        int out = decodeWays.numDecodings("0");
        assertEquals(0, out);
    }

    @Test
    public void testCase4() {
        int out = decodeWays.numDecodings("06");
        assertEquals(0, out);
    }
}
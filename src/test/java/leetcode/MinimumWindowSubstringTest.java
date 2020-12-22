package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {
    @Test
    public void testCase1() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "AACBDDF";
        String t = "ADD";
        String output = "ACBDD";
        assertEquals(output, solution.minWindow(s,t));
    }

    @Test
    public void testCase2() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String output = "BANC";
        assertEquals(output, solution.minWindow(s,t));
    }

    @Test
    public void testCase3() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "a";
        String t = "a";
        String output = "a";
        assertEquals(output, solution.minWindow(s,t));
    }

    @Test
    public void testCase4() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ABC";
        String t = "BAC";
        String output = "ABC";
        assertEquals(output, solution.minWindow(s,t));
    }

    @Test
    public void testCase5() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ABCCBA";
        String t = "BAC";
        String output = "ABC";
        assertEquals(output, solution.minWindow(s,t));
    }

    @Test
    public void testCase6() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "AABCCC";
        String t = "BAC";
        String output = "ABC";
        assertEquals(output, solution.minWindow(s,t));
    }

    @Test
    public void testCase7() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "";
        String t = "B";
        String output = "B";
        assertEquals(output, solution.minWindow(s,t));
    }

}
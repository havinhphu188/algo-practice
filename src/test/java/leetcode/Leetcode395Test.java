package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode395Test {
    @Test
    public void testCase1() {
        Leetcode395 sol = new Leetcode395();
        assertEquals(3, sol.longestSubstring("acaacdbbbc", 3));
    }

    @Test
    public void testCase2() {
        Leetcode395 sol = new Leetcode395();
        assertEquals(3, sol.longestSubstring("aaabb", 3));
    }

    @Test
    public void testCase3() {
        Leetcode395 sol = new Leetcode395();
        assertEquals(5, sol.longestSubstring("ababbc", 2));
    }

    @Test
    public void testCase4() {
        Leetcode395 sol = new Leetcode395();
        assertEquals(4, sol.longestSubstring("baab", 2));
    }

    @Test
    public void testCase5() {
        Leetcode395 sol = new Leetcode395();
        assertEquals(0, sol.longestSubstring("bacab", 2));
    }

    @Test
    public void testCase6() {
        Leetcode395 sol = new Leetcode395();
        assertEquals(10, sol.longestSubstring("aaaaaaaaabbbcccccddddd", 5));
    }
}
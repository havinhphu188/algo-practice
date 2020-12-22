package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {
    @Test
    public void testCase1() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "aaa";
        int output = 6;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase2() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "abc";
        int output = 3;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase3() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "abbab";
        int output = 8;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase4() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "a";
        int output = 1;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase5() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "";
        int output = 0;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase6() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "abccba";
        int output = 9;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase7() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "pabbaw";
        int output = 8;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase8() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "abba";
        int output = 6;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase9() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "aba";
        int output = 4;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase10() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "pabaw";
        int output = 6;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase11() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "paba";
        int output = 5;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase12() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "abaw";
        int output = 5;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase13() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "abbaw";
        int output = 7;
        assertEquals(output, solution.countSubstrings(input));
    }

    @Test
    public void testCase14() {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String input = "wabba";
        int output = 7;
        assertEquals(output, solution.countSubstrings(input));
    }
}
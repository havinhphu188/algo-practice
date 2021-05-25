package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    @Test
    public void testCase1() {
        IsSubsequence sol = new IsSubsequence();
        assertEquals(true, sol.isSubsequence("abc","ahbgdc"));
    }

    @Test
    public void testCase2() {
        IsSubsequence sol = new IsSubsequence();
        assertEquals(false, sol.isSubsequence("axc","ahbgdc"));
    }

    @Test
    public void testCase3() {
        IsSubsequence sol = new IsSubsequence();
        assertEquals(true, sol.isSubsequence("a","bac"));
    }

    @Test
    public void testCase4() {
        IsSubsequence sol = new IsSubsequence();
        assertEquals(false, sol.isSubsequence("a","bxc"));
    }

    @Test
    public void testCase5() {
        IsSubsequence sol = new IsSubsequence();
        assertEquals(true, sol.isSubsequence("bc","bac"));
    }

    @Test
    public void testCase6() {
        IsSubsequence sol = new IsSubsequence();
        assertEquals(false, sol.isSubsequence("bcaa","bac"));
    }
}
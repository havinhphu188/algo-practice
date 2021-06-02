package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {
    @Test
    public void testCase1() {
        DecodeString sol = new DecodeString();
        assertEquals("aaabcbc", sol.decodeString("3[a]2[bc]"));
    }

    @Test
    public void testCase2() {
        DecodeString sol = new DecodeString();
        assertEquals("aababaababaabab", sol.decodeString("3[a2[ab]]"));
    }

    @Test
    public void testCase3() {
        DecodeString sol = new DecodeString();
        assertEquals("a", sol.decodeString("a"));
    }

    @Test
    public void testCase4() {
        DecodeString sol = new DecodeString();
        assertEquals("aaabcbc", sol.decodeString("3[a]2[bc]"));
    }

    @Test
    public void testCase5() {
        DecodeString sol = new DecodeString();
        assertEquals("accaccacc", sol.decodeString("3[a2[c]]"));
    }

    @Test
    public void testCase6() {
        DecodeString sol = new DecodeString();
        assertEquals("abcabccdcdcdef", sol.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void testCase7() {
        DecodeString sol = new DecodeString();
        assertEquals("abccdcdcdxyz", sol.decodeString("abc3[cd]xyz"));
    }
}
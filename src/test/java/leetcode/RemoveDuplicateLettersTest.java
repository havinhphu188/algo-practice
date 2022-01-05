package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {
    @Test
    public void testCase1() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("abc", sol.removeDuplicateLetters("bcabc"));
    }

    @Test
    public void testCase2() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("ab", sol.removeDuplicateLetters("bbbbaaaabbbb"));
    }

    @Test
    public void testCase3() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("ab", sol.removeDuplicateLetters("bab"));
    }

    @Test
    public void testCase4() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("bca", sol.removeDuplicateLetters("bbbbccccaaaaa"));
    }

    @Test
    public void testCase5() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("b", sol.removeDuplicateLetters("bbb"));
    }

    @Test
    public void testCase6() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("nlmop", sol.removeDuplicateLetters("nnnlllmmmoop"));
    }

    @Test
    public void testCase7() {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        assertEquals("acdb", sol.removeDuplicateLetters("cbacdcbc"));
    }

}
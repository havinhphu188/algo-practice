package leedcodeeasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    @Test
    public void testCase1() {
        WordPattern sol = new WordPattern();
        assertEquals(true, sol.wordPattern("abba","dog cat cat dog"));
    }

    @Test
    public void testCase2() {
        WordPattern sol = new WordPattern();
        assertEquals(false, sol.wordPattern("abba","dog cat cat fish"));
    }

    @Test
    public void testCase3() {
        WordPattern sol = new WordPattern();
        assertEquals(false, sol.wordPattern("abba","dog dog dog dog"));
    }

}
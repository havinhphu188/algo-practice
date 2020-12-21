package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testCase1() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abcabcbb";
        int output = 3;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCaseEXP() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "itkfiieii";
        int output = 4;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase2() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "bbbbbbbb";
        int output = 1;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase3() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "a";
        int output = 1;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase4() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "wwwwwwwabc";
        int output = 4;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase5() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abcwwwwwwww";
        int output = 4;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase6() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abc";
        int output = 3;
        assertEquals(output, solution.lengthOfLongestSubstring(input));
    }

}
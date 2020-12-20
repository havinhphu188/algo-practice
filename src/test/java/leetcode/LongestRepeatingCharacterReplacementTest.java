package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {
    @Test
    public void testCase1() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "AABABBA";
        int k = 1;
        int output = 4;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase2() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "A";
        int k = 2;
        int output = 1;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase3() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "AA";
        int k = 4;
        int output = 2;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase4() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "";
        int k = 1;
        int output = 0;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }
    @Test
    public void testCase5() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "BBBBBBB";
        int k = 1;
        int output = 7;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }
    @Test
    public void testCase6() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "AABABBA";
        int k = 0;
        int output = 2;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase7() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "ABAB";
        int k = 2;
        int output = 4;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase8() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "AABBBB";
        int k = 2;
        int output = 6;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase9() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "AABBBBBBBXX";
        int k = 1;
        int output = 8;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }

    @Test
    public void testCase10() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String inputS = "IFLAKDTODTSNQDHMESGLECHFHTGLDFEAHKMBJPAGDMTIJIOQBPDBMBFNKFFDRSESRDINQICMDRQHLSQIKTHKQLEGBMIESPTSGADR";
        int k = 5;
        int output = 8;
        assertEquals(output,
                longestRepeatingCharacterReplacement.characterReplacement(inputS,k));
    }



}
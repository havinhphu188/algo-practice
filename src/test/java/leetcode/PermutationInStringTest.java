package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
    @Test
    public void testCase1() {
        PermutationInString sol = new PermutationInString();
        assertEquals(true, sol.checkInclusion("abc", "abbca"));
    }

    @Test
    public void testCase2() {
        PermutationInString sol = new PermutationInString();
        assertEquals(true, sol.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void testCase3() {
        PermutationInString sol = new PermutationInString();
        assertEquals(false, sol.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void testCase4() {
        PermutationInString sol = new PermutationInString();
        assertEquals(true, sol.checkInclusion("aabb", "mkowbbaa"));
    }

    @Test
    public void testCase5() {
        PermutationInString sol = new PermutationInString();
        assertEquals(false, sol.checkInclusion("aabb", "mkowbboaa"));
    }

    @Test
    public void testCase6() {
        PermutationInString sol = new PermutationInString();
        assertEquals(false, sol.checkInclusion("aabb", "bba"));
    }

    @Test
    public void testCase7() {
        PermutationInString sol = new PermutationInString();
        assertEquals(true, sol.checkInclusion("adc", "dcda"));
    }
}
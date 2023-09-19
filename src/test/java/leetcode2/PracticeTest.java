package leetcode2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PracticeTest {

    @Test
    public void testCase1() {
        Solution solution = new Solution();
//        System.out.println(solution.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
//        System.out.println(solution.decodeString("3[a]2[bc]"));
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
//        System.out.println(solution.decodeString("3[a]2[bc]"));
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
//        System.out.println(solution.decodeString("3[a]2[bc]"));
        assertEquals("kkkkkkkkkk", solution.decodeString("10[k]"));
    }

    @Test
    public void testCase5() {
        Solution solution = new Solution();
//        System.out.println(solution.decodeString("3[a]2[bc]"));
        assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }
}
package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    public void testCase1() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] input = new String[]{"eat"};
        List<List<String>> output = new ArrayList<>();
        List<String> data = new ArrayList<>();
        data.add("eat");
        output.add(data);

        assertEquals(output,groupAnagrams.groupAnagrams(input));

    }
}
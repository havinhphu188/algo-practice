package leetcode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainDuplicateTest {
    private static ContainDuplicate containDuplicate;

    @BeforeAll
    public static void init(){
        containDuplicate = new ContainDuplicate();
    }

    @Test
    public void testCase1(){
        int[] input = new int[]{1,2,3,1};
        boolean output = containDuplicate.containsDuplicate(input);
        assertEquals(true, output);
    }

    @Test
    public void testCase2(){
        int[] input = new int[]{1,2,3,4};
        boolean output = containDuplicate.containsDuplicate(input);
        assertEquals(false, output);
    }

    @Test
    public void testCase3(){
        int[] input = new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean output = containDuplicate.containsDuplicate(input);
        assertEquals(true, output);
    }


}
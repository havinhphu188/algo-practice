package leetcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    @Test
    public void testCase1() {
        ValidParentheses validParentheses = new ValidParentheses();
        String input = "()";
        boolean output = validParentheses.isValid(input);
        assertEquals(true, output);
    }

    @Test
    public void testCase2() {
        ValidParentheses validParentheses = new ValidParentheses();
        String input = "[";
        boolean output = validParentheses.isValid(input);
        assertEquals(false, output);
    }

    @Test
    public void testCase3() {
        ValidParentheses validParentheses = new ValidParentheses();
        String input = "))))";
        boolean output = validParentheses.isValid(input);
        assertEquals(false, output);
    }
}
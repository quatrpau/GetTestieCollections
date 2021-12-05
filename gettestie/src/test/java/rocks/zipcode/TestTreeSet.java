package rocks.zipcode;
//contains no duplicate element
//can be provided a comparator at construction (defaulted to natural ordering)
//gotta test ordering (ie: use comparable as reference)
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class TestTreeSet {
    private Stack<String> stack;
    @Before
    public void setUp() throws Exception {
        //given
        stack = new Stack<>();
    }
    @Test
    public void TestStackPush() {
        //when
        stack.push("Hello world");
        //then
        assertFalse(stack.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        stack.push("Hello World");
        //when
        stack.pop();
        //then
        assertTrue(stack.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(stack.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        stack.push("h");
        assertEquals(expected,stack.peek());
        assertFalse(stack.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

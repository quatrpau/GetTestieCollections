package rocks.zipcode;

//use this to have to write less
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
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

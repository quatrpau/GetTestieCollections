package rocks.zipcode;

//cp from list
//next, hasnext
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestIterator {
    private Iterator<String> iterator;
    priavate
    @Before
    public void setUp() throws Exception {
        //given
        iterator = new<>();
    }
    @Test
    public void TestStackPush() {
        //when
        iterator.push("Hello world");
        //then
        assertFalse(iterator.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        iterator.push("Hello World");
        //when
        iterator.pop();
        //then
        assertTrue(iterator.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(iterator.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        iterator.push("h");
        assertEquals(expected,iterator.peek());
        assertFalse(iterator.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

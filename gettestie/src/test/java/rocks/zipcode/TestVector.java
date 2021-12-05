package rocks.zipcode;

//thread safe version of arrayList

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;
import java.util.Vector;

import static org.junit.Assert.*;

public class TestVector {
    private Vector<String> vector;
    @Before
    public void setUp() throws Exception {
        //given
        vector = new Vector<>();
    }
    @Test
    public void TestStackPush() {
        //when
        vector.push("Hello world");
        //then
        assertFalse(vector.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        vector.push("Hello World");
        //when
        vector.pop();
        //then
        assertTrue(vector.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(vector.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        vector.push("h");
        assertEquals(expected,vector.peek());
        assertFalse(vector.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

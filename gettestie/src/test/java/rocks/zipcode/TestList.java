package rocks.zipcode;

//use this to have to write less
//add, get , remove, size
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestList {
    private List<String> list;
    @Before
    public void setUp() throws Exception {
        //given
        list = new ArrayList<>();
    }
    @Test
    public void TestStackPush() {
        //when
        list.push("Hello world");
        //then
        assertFalse(list.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        list.push("Hello World");
        //when
        list.pop();
        //then
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        list.push("h");
        assertEquals(expected,list.peek());
        assertFalse(list.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

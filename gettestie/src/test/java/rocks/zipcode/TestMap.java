package rocks.zipcode;

//use this to have to write less
//put, get, remove, size
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestMap {
    private Map<String,String> map;
    @Before
    public void setUp() throws Exception {
        //given
        map = new HashMap<>();
    }
    @Test
    public void TestStackPush() {
        //when
        map.push("Hello world");
        //then
        assertFalse(map.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        map.push("Hello World");
        //when
        map.pop();
        //then
        assertTrue(map.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(map.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        map.push("h");
        assertEquals(expected,map.peek());
        assertFalse(map.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

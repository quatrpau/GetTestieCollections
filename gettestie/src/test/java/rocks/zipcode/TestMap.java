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
    public void TestPut() {
        //when
        String expected = "h";
        map.put("h","h");
        //then
        assertFalse(map.isEmpty()); // false
    }
    @Test
    public void TestGet() {

        String expected = "h";
        map.put("h","h");
        assertEquals(expected,map.get("h"));
    }

    @Test
    public void TestIsEmpty() {
        assertTrue(map.isEmpty());
    }

    @Test
    public void TestRemove() {
        //when
        map.put("h","h");
        map.remove("h");
        assertTrue(map.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

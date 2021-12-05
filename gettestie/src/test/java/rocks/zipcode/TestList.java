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
    public void TestAdd() {
        String expected = "Hello world";
        list.add(expected);
        assertFalse(list.isEmpty());
    }

    @Test
    public void TestGet() {
        //when
        String expected = "Hello world";
        list.add(expected);
        //then
        assertEquals(expected, list.get(0)); // false
    }

    @Test
    public void TestIsEmpty() {
        //when^
        //then
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestRemove() {
        //when
        list.add("h");
        list.remove(0);
        assertTrue(list.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

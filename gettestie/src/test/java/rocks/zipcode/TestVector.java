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
    public void TestAdd() {
        String expected = "Hello world";
        vector.add(expected);
        assertFalse(vector.isEmpty());
    }

    @Test
    public void TestGet() {
        //when
        String expected = "Hello world";
        vector.add(expected);
        //then
        assertEquals(expected, vector.get(0)); // false
    }

    @Test
    public void TestIsEmpty() {
        //when^
        //then
        assertTrue(vector.isEmpty());
    }

    @Test
    public void TestRemove() {
        //when
        vector.add("h");
        vector.remove(0);
        assertTrue(vector.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

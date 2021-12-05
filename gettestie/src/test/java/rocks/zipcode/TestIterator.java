package rocks.zipcode;

//cp from list
//next, hasnext
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestIterator {
    private Iterator<String> iterator;
    private Iterable<String> list;
    @Before
    public void setUp() throws Exception {
        //given
        list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        iterator = list.iterator();
    }
    @Test
    public void TestNext() {
        //when
        iterator.push("Hello world");
        //then
        assertFalse(iterator.isEmpty()); // false
    }
    @Test
    public void TestHasNext() {
        iterator.push("Hello World");
        //when
        iterator.pop();
        //then
        assertTrue(iterator.isEmpty());
    }

    @Test
    public void TestHasNext2() {
        //when^
        //then
        assertTrue(iterator.isEmpty());
    }

}

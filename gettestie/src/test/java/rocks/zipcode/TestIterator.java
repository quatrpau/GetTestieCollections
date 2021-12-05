package rocks.zipcode;

//cp from list
//next, hasnext
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

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
        String actual = iterator.next();
        //then
        assertEquals("a",actual); // false
    }
    @Test
    public void TestHasNext() {
        Stream
            .iterate(0,q-> q+1)
            .limit(3)
            .forEach(q -> iterator.next());
        //when
        //then
        assertFalse(iterator.hasNext());
    }

    @Test
    public void TestHasNext2() {
        //when^
        //then
        assertTrue(iterator.hasNext());
    }

}

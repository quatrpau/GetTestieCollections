package rocks.zipcode;
//contains no duplicate element
//can be provided a comparator at construction (defaulted to natural ordering)
//gotta test ordering (ie: use comparable as reference)
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestTreeSet {
    private TreeSet<String> treeSet;
    @Before
    public void setUp() throws Exception {
        //given
        treeSet = new TreeSet<>();
    }
    @Test
    public void TestStackPush() {
        //when
        treeSet.push("Hello world");
        //then
        assertFalse(treeSet.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        treeSet.push("Hello World");
        //when
        treeSet.pop();
        //then
        assertTrue(treeSet.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(treeSet.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        treeSet.push("h");
        assertEquals(expected, treeSet.peek());
        assertFalse(treeSet.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

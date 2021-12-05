package rocks.zipcode;
//sorted by comparator provided at construction (default is natural ordering)
//comparator must be consistent with equals (pretty implicit)
//imp of map where order is maintained
//gotta test ordering

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TestTreeMap {
    private TreeMap<String,String> treeMap;
    @Before
    public void setUp() throws Exception {
        //given
        treeMap = new TreeMap<>();
    }
    @Test
    public void TestStackPush() {
        //when
        treeMap.push("Hello world");
        //then
        assertFalse(treeMap.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        treeMap.push("Hello World");
        //when
        treeMap.pop();
        //then
        assertTrue(treeMap.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(treeMap.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        treeMap.push("h");
        assertEquals(expected,treeMap.peek());
        assertFalse(treeMap.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

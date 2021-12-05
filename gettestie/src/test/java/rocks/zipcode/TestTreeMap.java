package rocks.zipcode;
//sorted by comparator provided at construction (default is natural ordering)
//comparator must be consistent with equals (pretty implicit)
//imp of map where order is maintained
//gotta test ordering

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TestTreeMap {
    private TreeMap<Integer,Integer> treeMap;
    @Before
    public void setUp() throws Exception {
        //given
        treeMap = new TreeMap<>();
    }
    @Test
    public void TestPut() {
        //when
        treeMap.put(1,1);
        //then
        assertFalse(treeMap.isEmpty()); // false
    }
    @Test
    public void TestGet() {

        Integer expected = 1;
        treeMap.put(expected,expected);
        assertEquals(expected,treeMap.get(expected));
    }

    @Test
    public void TestIsEmpty() {
        assertTrue(treeMap.isEmpty());
    }

    @Test
    public void TestRemove() {
        //when
        treeMap.put(1,1);
        treeMap.remove(1);
        assertTrue(treeMap.isEmpty());

    }

    @Test
    public void TestOrdering() {
        Integer one = 1;
        Integer zero = 0;
        treeMap.put(one,112);
        treeMap.put(zero,32);
        assertEquals(zero,treeMap.pollFirstEntry().getKey());
    }
// Make a bigger test exercising more Stack methods.....
}

package rocks.zipcode;
//contains no duplicate element
//can be provided a comparator at construction (defaulted to natural ordering)
//gotta test ordering (ie: use comparable as reference)
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestTreeSet {
    private TreeSet<Integer> treeSet;
    @Before
    public void setUp() throws Exception {
        //given
        treeSet = new TreeSet<>();
    }
    @Test
    public void TestAdd() {
        //when
        treeSet.add(1);
        //then
        assertFalse(treeSet.isEmpty()); // false
    }
    @Test
    public void TestRemove() {
        treeSet.add(1);
        //when
        treeSet.remove(1);
        //then
        assertTrue(treeSet.isEmpty());
    }

    @Test
    public void TestIsEmpty() {
        //when^
        //then
        assertTrue(treeSet.isEmpty());
    }

    @Test
    public void TestContains() {
        //when
        Integer expected = 1;
        treeSet.add(expected);
        assertTrue(treeSet.contains(expected));

    }
    @Test
    public void TestOrdering(){
        Integer one = 1;
        Integer zero = 0;
        treeSet.addAll(Arrays.asList(one,zero));
        assertEquals(zero,treeSet.pollFirst());

    }
    // Make a bigger test exercising more Stack methods.....
}

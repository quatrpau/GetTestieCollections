package rocks.zipcode;

//use this to have to write less

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class TestComparable {
    private Comparable<Integer> one;
    //as params to a method (like ones with a class of parameterized type) be more specific in your declaration
    // ie: use Integer instead of Comparable<Integer> when using a method in Comparable<Integer>
    @Before
    public void setUp() throws Exception {
        //given
        one = 1;
    }
    @Test
    public void TestEquals() {
        assertEquals(0,one.compareTo(1));
    }
    @Test
    public void TestBigger() {
        assertEquals(-1,one.compareTo(2));
    }

    @Test
    public void TestSmaller() {
        assertEquals(1,one.compareTo(0));
    }
}

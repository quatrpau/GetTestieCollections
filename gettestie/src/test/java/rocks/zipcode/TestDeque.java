package rocks.zipcode;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;
//supports removal and addition at both ends
//stack and queue combined
public class TestDeque {
    private Deque<String> deque;
    @Before
    public void setUp() throws Exception {
        //given
        deque = new ArrayDeque<>();
    }
    @Test
    public void TestStackPush () {
        //when
        deque.push("Hello world");
        //then
        assertFalse(deque.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        deque.push("Hello World");
        //when
        deque.pop();
        //then
        assertTrue(deque.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(deque.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        deque.push("h");
        assertEquals(expected, deque.peek());
        assertFalse(deque.isEmpty());

    }
    @Test
    public void TestOffer() {
        //when
        deque.offer("Hello world");
        //then
        assertFalse(deque.isEmpty()); // false
    }
    @Test
    public void TestPoll() {
        deque.offer("Hello World");
        //when
        deque.poll();
        //then
        assertTrue(deque.isEmpty());
    }
    // Make a bigger test exercising more Stack methods.....
}

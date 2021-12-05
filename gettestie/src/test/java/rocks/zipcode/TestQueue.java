package rocks.zipcode;

//fifo
//offer(E), poll, peek, size

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestQueue {
    private Queue<String> queue;
    @Before
    public void setUp() throws Exception {
        //given
        queue = new LinkedList<>();
    }
    @Test
    public void TestOffer() {
        //when
        queue.offer("Hello world");
        //then
        assertFalse(queue.isEmpty()); // false
    }
    @Test
    public void TestPoll() {
        queue.offer("Hello World");
        //when
        queue.poll();
        //then
        assertTrue(queue.isEmpty());
    }

    @Test
    public void TestIsEmpty() {
        //when^
        //then
        assertTrue(queue.isEmpty());
    }

    @Test
    public void TestPeek() {
        //when
        String expected = "h";
        queue.offer("h");
        assertEquals(expected,queue.peek());
        assertFalse(queue.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

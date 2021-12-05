package rocks.zipcode;
//takes an optional comparator at construction time (default is natural ordering)
//a version of a queue where the head is the least element with respect to comparator provided
//offer(E), E poll,  E peek, isEmpty()
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestPriorityQueue {
    private PriorityQueue<String> priorityQueue;
    @Before
    public void setUp() throws Exception {
        //given
        priorityQueue = new PriorityQueue<>();
    }
    @Test
    public void TestStackPush() {
        //when
        priorityQueue.push("Hello world");
        //then
        assertFalse(priorityQueue.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        priorityQueue.push("Hello World");
        //when
        priorityQueue.pop();
        //then
        assertTrue(priorityQueue.isEmpty());
    }

    @Test
    public void TestStackIsEmpty() {
        //when^
        //then
        assertTrue(priorityQueue.isEmpty());
    }

    @Test
    public void TestStackPeek() {
        //when
        String expected = "h";
        priorityQueue.push("h");
        assertEquals(expected,priorityQueue.peek());
        assertFalse(priorityQueue.isEmpty());

    }
    // Make a bigger test exercising more Stack methods.....
}

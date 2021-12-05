package rocks.zipcode;
//takes an optional comparator at construction time (default is natural ordering)
//a version of a queue where the head is the least element with respect to comparator provided
//offer(E), E poll,  E peek, isEmpty()
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.Assert.*;

public class TestPriorityQueue {
    private PriorityQueue<Integer> priorityQueue;
    @Before
    public void setUp() throws Exception {
        //given
        priorityQueue = new PriorityQueue<>();
    }
    @Test
    public void TestOffer() {
        //when
        priorityQueue.offer("Hello world");
        //then
        assertFalse(priorityQueue.isEmpty()); // false
    }
    @Test
    public void TestStackPop() {
        priorityQueue.offer(1);
        //when
        priorityQueue.poll();
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
        Integer expected = 1;
        priorityQueue.offer(1);
        assertEquals(expected,priorityQueue.peek());

    }
    @Test
    public void TestOrdering(){
        Integer one = 1;
        Integer two = 2;
        Integer zero = 0;
        priorityQueue.addAll(new ArrayList<>(Arrays.asList(two,zero,one)));
        assertEquals(zero,priorityQueue.poll());
    }
    // Make a bigger test exercising more Stack methods.....
}

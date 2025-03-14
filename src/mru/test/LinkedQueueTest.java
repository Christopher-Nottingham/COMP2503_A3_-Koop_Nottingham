package mru.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import mru.controller.LinkedQueue;
import mru.controller.QNode;
/**
 * Linked Queue JUnit test
 * @author christophernottingham
 *
 */
class LinkedQueueTest {
	
	@Test
	/**
	 * Testing the get size
	 */
	void testGetSize() {
		
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		
		int expected = 1;
		int recived = queue.getSize();
		
		assertEquals(expected, recived);
		
	}
	
	@Test 
	/**
	 * Testing the peek method
	 */
	void testPeek () {
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		queue.enqueue("Ethan");
		String expected = "Christopher";
		String recived = queue.peek(); 
		
		assertEquals(expected, recived);
	}
	
	@Test
	/**
	 * Testing the dequeue method
	 */
	void testDequeue () {
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		queue.enqueue("Ethan");
		String notExpected = "Ethan";
		String recived = queue.dequeue();
		assertNotEquals(notExpected,recived);
	}
	
	
	@Test
	/**
	 * Testing the enqueue method
	 */
	void testEnqueue () {
		String expected = "Christopher";
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		String recived = queue.peek().toString();
		assertEquals(expected, recived );
	
	}
	
	
	

}

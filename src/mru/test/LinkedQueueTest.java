package mru.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import mru.controller.LinkedQueue;
import mru.controller.QNode;
/**
 * 
 * @author christophernottingham
 *
 */
class LinkedQueueTest {
	
	/*
	 * To Test: 
		 * enqueue 
		 * dequeue 
		 * getSize 
		 * peek
	 * 
	 */
	


	@Test
	void testGetSize() {
		
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		
		int expected = 1;
		int recived = queue.getSize();
		
		assertEquals(expected, recived);
		
	}
	
	@Test 
	void testPeek () {
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		queue.enqueue("Ethan");
		String expected = "Christopher";
		String recived = queue.peek(); 
		
		assertEquals(expected, recived);
	}
	
	@Test
	void testDequeue () {
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		queue.enqueue("Ethan");
		String notExpected = "Ethan";
		String recived = queue.dequeue();
		assertNotEquals(notExpected,recived);
	}
	
	
	@Test
	void testEnqueue () {
		String expected = "Christopher";
		LinkedQueue <String> queue = new LinkedQueue();
		queue.enqueue("Christopher");
		String recived = queue.getFront().toString();
		assertEquals(expected, recived );
	
	}
	
	
	

}

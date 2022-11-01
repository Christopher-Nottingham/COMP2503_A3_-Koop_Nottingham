package mru.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mru.controller.PriorityQueue;

/**
 * 
 * @author Ethan Koop
 * JUnit Tests for the PriorityQueue Class
 */
class PriorityQueueTest {

	@Test
	void testEnqueue() {
		PriorityQueue <String> test = new PriorityQueue<>();
		test.enqueue("Ethan");
		test.enqueue("Christopher");
		test.enqueue("Xavier");
	
		assertEquals("Xavier", test.peek());
	}

	@Test
	void testDequeue() {
		PriorityQueue <String> test = new PriorityQueue<>();
		test.enqueue("Ethan");
		test.enqueue("Christopher");
		test.enqueue("Xavier");
		
		assertNotEquals("Ethan", "Christopher" , test.dequeue());
	}
	
	@Test
	void testGetSize() {
		PriorityQueue <String> test = new PriorityQueue<>();
		test.enqueue("Ethan");
		test.enqueue("Christopher");
		test.enqueue("Xavier");
		
		assertEquals(3, test.getSize());
	}
	
	@Test
	void testPeek() {
		PriorityQueue <String> test = new PriorityQueue<>();
		test.enqueue("Ethan");
		test.enqueue("Christopher");
		test.enqueue("Xavier");
		test.dequeue();
		assertEquals("Ethan", test.peek());
	}
	

}

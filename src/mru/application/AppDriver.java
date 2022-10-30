package mru.application;
import java.util.LinkedList;
import java.util.Queue;

import mru.controller.LinkedQueue;
import mru.controller.PriorityQueue;

public class AppDriver {
	public static void main(String[] args) {
		 LinkedQueue<String> linkedQueueNames = new LinkedQueue<>();

		 PriorityQueue<String> priorityQueueNames = new PriorityQueue<>();
  
    
   
    System.out.println("Printing the linked Queue:");
    linkedQueueNames.enqueue("Chris");
    linkedQueueNames.enqueue("Joe");
    linkedQueueNames.enqueue("Ethan");
    linkedQueueNames.enqueue("Susan");
    
    linkedQueueNames.dequeue();
    linkedQueueNames.printQueue();
    
    System.out.println("\n");
    
    
    System.out.println("Printing priority Queue:");
    priorityQueueNames.enqueue("Abby");
    priorityQueueNames.enqueue("Zander");
    priorityQueueNames.enqueue("Tod");
    priorityQueueNames.enqueue("Ethan");
    priorityQueueNames.enqueue("Christopher");
    priorityQueueNames.dequeue();
    
   
    
    priorityQueueNames.printQueue();
  
   
	}
  
   
   

    
    
  
}

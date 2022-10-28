package mru.application;
import java.util.LinkedList;
import java.util.Queue;

import mru.controller.LinkedQueue;
import mru.controller.PriorityQueue;

public class AppDriver {
	public static void main(String[] args) {
		 LinkedQueue<String> linkedQueueNames = new LinkedQueue<>();

		 PriorityQueue<String> priorityQueueNames = new PriorityQueue<>();
  
    
   
    
    linkedQueueNames.enqueue("Chris");
    linkedQueueNames.enqueue("Joe");
    linkedQueueNames.enqueue("Ethan");
    linkedQueueNames.enqueue("Susan");
    
    linkedQueueNames.dequeue();
    linkedQueueNames.printQueue();
    
    
    System.out.println("Printing priority Queue: \n");
    priorityQueueNames.enqueue("Abby");
    priorityQueueNames.enqueue("Zander");
    priorityQueueNames.enqueue("Tod");
    priorityQueueNames.enqueue("Ethan");
   
    
    priorityQueueNames.printQueue();
  
   
	}
  
   
   

    
    
  
}

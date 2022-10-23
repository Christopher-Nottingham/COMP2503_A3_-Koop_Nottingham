package mru.application;
import java.util.LinkedList;
import java.util.Queue;

import mru.controller.LinkedQueue;

public class AppDriver {
	public static void main(String[] args) {
		 LinkedQueue<String> linkedQueueNames = new LinkedQueue<>();

  
    
   
    
    linkedQueueNames.enqueue("Chris");
    linkedQueueNames.enqueue("Joe");
    linkedQueueNames.enqueue("Ethan");
    linkedQueueNames.enqueue("Susan");
    
    linkedQueueNames.dequeue();
    linkedQueueNames.printQueue();
    
  
   
	}
  
   
   

    
    
  
}

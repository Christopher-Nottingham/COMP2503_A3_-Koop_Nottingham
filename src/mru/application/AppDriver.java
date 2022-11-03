package mru.application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import mru.controller.LinkedQueue;
import mru.controller.PriorityQueue;

/**
 * The following class adds a list of names from the user and enqueue's them to
 * a priority queue queue and a linked queue
 * 
 * @author Christopher Nottingham
 *
 */
public class AppDriver {
	public static void main(String[] args) {

	  String aName;
	    LinkedQueue<String> linkedQueueNames = new LinkedQueue<>();

	    PriorityQueue<String> priorityQueueNames = new PriorityQueue<>();

	    Scanner in = new Scanner(System.in);
	    System.out.print("How many names do you want to add: ");
	    int numberOfNames = in.nextInt();
	    while (numberOfNames < 3) {
	      System.out.println("Must enter at least 3 names");
	      System.out.print("How many names do you want to add: ");
	      numberOfNames = in.nextInt();
	    }
	    in.reset();

	    for (int i = 0; i < numberOfNames; i++) {
	      System.out.print("Enter a name that you want to add to the queue: ");
	      aName = in.next();
	      linkedQueueNames.enqueue(aName);
	      priorityQueueNames.enqueue(aName);

	    }
	    



	    for (int i = 0; i < 2; i++) {
	      linkedQueueNames.dequeue();
	      priorityQueueNames.dequeue();
	    }


	    System.out.println("\nPrinting the linked Queue:");
	    printQueue(linkedQueueNames);

	    System.out.println("\n");

	    System.out.println("Printing priority Queue:");
	    printQueue(priorityQueueNames);
	    in.close();

	}

	/**
	 * Static method that prints a linked queue
	 * 
	 * @param aLinkedQueue A linked queue that the user wants to print
	 */
	static void printQueue(LinkedQueue aLinkedQueue) {
		LinkedQueue<String> theQueue = aLinkedQueue;

		theQueue.printQueue();

	}

	/**
	 * Static method that prints a priority queue
	 * 
	 * @param aPriorityQueue A priority queue that the user want to print
	 */
	private static void printQueue(PriorityQueue aPriorityQueue) {

		PriorityQueue theQueue = aPriorityQueue;
		theQueue.printQueue();

	}

}

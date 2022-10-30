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

		LinkedQueue<String> linkedQueueNames = new LinkedQueue<>();

		PriorityQueue<String> priorityQueueNames = new PriorityQueue<>();

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a name that you want to add to the queue: ");

		String aName = in.nextLine();

		Boolean userChoice = true;

		while (userChoice == true) {
			linkedQueueNames.enqueue(aName);
			priorityQueueNames.enqueue(aName);

			System.out.println("Would you like to continue?");
			System.out.println("Enter 1 to continue or 0 to exit");

			Scanner continueChecker = new Scanner(System.in);
			
			int toContinue = continueChecker.nextInt();

//			while (toContinue >= 2 && toContinue <= -1) {
//				System.out.println("Entered a wrong value.....");
//				System.out.println("Enter (1) to continue or (0) to exit");
//				System.out.print("Would you like to continue?");
//				continueChecker.reset();
//				toContinue = continueChecker.nextInt();
//			}

			if (toContinue == 1) {

				System.out.println("Enter a name that you want to add to the queue");

				aName = in.nextLine();
				userChoice = true;
			}

			else {
				userChoice = false;
			}

		}

		for (int i = 0; i < 2; i++) {
			linkedQueueNames.dequeue();
			priorityQueueNames.dequeue();

		}

		System.out.println("Printing the linked Queue:");
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

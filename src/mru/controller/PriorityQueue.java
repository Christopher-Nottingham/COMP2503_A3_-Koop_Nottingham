package mru.controller;

import java.util.NoSuchElementException;

import mru.model.QueueInterface;

/**
 * Priority Queue class
 * @author Ethan Koop
 * This class creates a priority queue, which sorts it's item depending on their priority.
 * In this case, the highest priority is the lowest valued item in the queue. 
 * @param <T>
 */
public class PriorityQueue<T> implements QueueInterface<T>{

	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	
	/**
	 * Constructor for Priority Queue Class
	 */
	public PriorityQueue() {
		
		size = 0;
		this.front = this.rear = null;
		
	}
	
	
	/**
	 * Adds a item to the queue
	 * Puts item with highest priority to the first position
	 * Highest priority is lowest value
	 */
	@Override
	public void enqueue(T t) {
			
		QNode<T> current = front;
        QNode<T> NodeToAdd = new QNode<T>(t);


        if(isEmpty())
            front = new QNode<T>(t);

        else {

            Comparable<T> compare = (Comparable<T>)(t);

            for(int i = 0; i < size; i++) {
            	
            	int result = compare.compareTo(current.getData());

                //Add as highest priority
                if(result > 0) {
                    NodeToAdd.setNext(front);
                    front = NodeToAdd;
                    break;
                }

                //Add behind highest priority
                else if(result < 0) {
                    NodeToAdd.setNext(current.getNext());
                    current.setNext(NodeToAdd);
                    break;
                }

                //Add as lowest priority
                else if(current.getNext() == null) {
                    current.setNext(NodeToAdd);
                    rear = NodeToAdd;
                    break;
                }

                current = current.getNext();
            }
        }
        size++;
		
			
		
	}

	/**
	 * Removes an item from the queue
	 * Removes the top data, the peek (item with highest priority).
	 */
	@Override
	public T dequeue() {
		if (isEmpty() == true) {
			throw new NoSuchElementException("Queue is empty!");
		} else {
			T data = front.data;
			front = front.next;
			size--;
			return data;
		}
	}

	/**
	 * Shows the top item in the queue
	 */
	@Override
	public T peek() {
		if (isEmpty() == true) {
			throw new NoSuchElementException("Queue is empty!");
		}

		return front.data;
	}

	/**
	 * Gets the size of the queue
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	/**
	 * Checks if queue is empty
	 */
	@Override
	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	/**
	 * Prints the queue
	 */
	@Override
	public void printQueue() {
		
	
		QNode<T> temp = new QNode<T>();
		temp = front;
		if (isEmpty() == true) {
			throw new NoSuchElementException("Queue is empty");
		}
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		
	}
	}

	
	
	
}

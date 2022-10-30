package mru.controller;

import java.util.NoSuchElementException;
import mru.model.QueueInterface;

/***
 * 
 * @author Christopher Nottingham This linked queue aims to replicate a normal
 *         queue that you would find at a bank 
 * @param <T> A generic data type for code re-use
 */
public class LinkedQueue<T> implements QueueInterface<T> {
	QNode<T> front, rear;
	int size;

	/**
	 * The Constructor
	 */
	public LinkedQueue() {
		size = 0;
		this.front = this.rear = null;
	}

	@Override
	/**
	 * A method to add someone to the end of the queue
	 */
	public void enqueue(T t) {

		if (isEmpty() != true) {
			rear.next = new QNode<T>(t);
			rear = rear.next;
		} else {
			rear = new QNode<T>(t);
			front = rear;
		}
		size++;

	}

	@Override
	/**
	 * A method to remove someone from the end of the queue
	 */
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

	@Override
	/**
	 * A method to check the top of the queue
	 */
	public T peek() {
		// TODO Auto-generated method stub
		return front.data;
	}

	@Override
	/**
	 * Getter method to know the number of people in the queue
	 */
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	/**
	 * A boolean returning method to return whether or not the queue is empty 
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (front == null)
			return true;
		else
			return false;
	}

	@Override
	/**
	 * A method to print the whole queue
	 */
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

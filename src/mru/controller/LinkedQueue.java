package mru.controller;

import java.util.NoSuchElementException;
import mru.model.QueueInterface;
/***
 * 
 * @author christophernottingham
 *
 * @param <T>
 */
public class LinkedQueue<T> implements QueueInterface<T> {
	QNode<T> front, rear;
	int size;

	public LinkedQueue() {
		size = 0;
		this.front = this.rear = null;
	}

	public QNode<T> getFront() {
		return front;
	}

	@Override
	public void enqueue(T t) {

		if (isEmpty() != true) {
			rear.next = new QNode<T>(t);
			;
			rear = rear.next;
		} else {
			rear = new QNode<T>(t);
			front = rear;
		}
		size++;

	}

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

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			throw new NoSuchElementException("Queue is empty!");
		}

		return front.data;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (front == null)
			return true;
		else
			return false;
	}

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

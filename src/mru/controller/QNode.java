package mru.controller;

/**
 * 
 * @author Christopher Nottingham This class is designed to replicate a person
 *         in the generic queue
 * @param <T> The generic data type that is used
 */
public class QNode<T> {

	T data;
	QNode<T> next;

	/**
	 * The constructor
	 * 
	 * @param data The name of the person that can take any form
	 */
	public QNode(T data) {
		this.data = data;
	}

	/**
	 * A empty constructor used to initate the super class
	 */
	public QNode() {

	}

	@Override
	/**
	 * Overridden toString to send the nodes data back to the user
	 */
	public String toString() {
		return data.toString();

	}

	/**
	 * Getter method for the data field
	 * @return The data within the node
	 */
	public T getData() {
		return data;
	}

	/**
	 * The setter for the data field
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * The getter for finding the next node
	 * @return The next node
	 */
	public QNode<T> getNext() {
		return next;
	}

	/**
	 * The setter for setting the new next node
	 * @param next The new next node
	 */
	public void setNext(QNode<T> next) {
		this.next = next;
	}

}

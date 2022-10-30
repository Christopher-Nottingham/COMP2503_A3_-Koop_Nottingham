package mru.model;
/**
 * 
 * @author Christopher Nottingham
 * A queue interface used for blueprinting
 * @param <T> The generic data type
 */
public interface QueueInterface<T> {
  
	/**
	 * Method should queue from the rear of the queue
	 * @param t The data that you want to put in the queue
	 */
  public void enqueue(T t);

  /**
   * Method should remove a node from the front of the queue
   * @return The removed node
   */
  public T dequeue();

  /**
   * Method should return the node from the front of the queue but not delete it
   * @return
   */
  public T peek();

  /**
   * Method should return the size of the queue
   * @return The integer size of the queue
   */
  int getSize();

  /**
   * Method should return whether the queue is empty or not.
   * Normally checks from the front of the queue.
   * @return The boolean value of whether the queue is empty
   */
  boolean isEmpty();
  
  /**
   * Method should print the queue from the front to the rear
   */
  public void printQueue ();
}

package mru.model;
/**
 * 
 * @author christophernottingham
 *
 * @param <T>
 */
public interface QueueInterface<T> {
  
  public void enqueue(T t);

  public T dequeue();

  public T peek();

  int getSize();

  boolean isEmpty();
  
  public void printQueue ();
}

package mru.controller;

public class QNode<T> {
T data;
QNode <T> next;

public QNode (T data) {
this.data=data;
}
public QNode() {
  
}
public String toString() {
  return data.toString();
  
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public QNode<T> getNext() {
	return next;
}
public void setNext(QNode<T> next) {
	this.next = next;
}



}

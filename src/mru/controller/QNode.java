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


}

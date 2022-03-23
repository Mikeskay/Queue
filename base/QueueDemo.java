package queue.base;

import java.util.*;

public class QueueDemo <T> {

private Queue <T> list; 


  public QueueDemo(){

      list = new LinkedList<T>(); 

  }

  public T head() {
      return list.peek();
  }

  /*public T tail() {

      Iterator<T> it = list.iterator();


      return it.next();
  }*/

  public void enqueue(T item) {
       list.add(item);
  }

  public T dequeue() {
      return list.poll();
  }

  public String toString(){

      return "Queue: " + list;
  }

}
    


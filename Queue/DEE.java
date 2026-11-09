/*
 * Topic : Deque (Double Ended Queue) in Java
 * GFG   : https://www.geeksforgeeks.org/deque-interface-java-example/
 *
 * Notes:
 * A Deque allows insertion and deletion at both ends. addFirst / addLast add,
 * removeFirst / removeLast remove, and getFirst / getLast read the ends. This
 * example uses LinkedList as the Deque implementation.
 */
package Queue;

import java.util.*;

public class DEE {
   public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
    
    deque.addFirst(2);
    deque.addFirst(1);
    deque.addFirst(0);
    deque.addLast(3);
    deque.addLast(4);
    deque.removeFirst();
    System.out.println(deque);
    System.out.println(deque.getFirst());
    System.out.println(deque.getLast());
   } 
}

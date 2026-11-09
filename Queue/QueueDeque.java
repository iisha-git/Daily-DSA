/*
 * Problem : Implement a Queue using Deque
 * GFG     : https://www.geeksforgeeks.org/implement-queue-using-deque-in-java/
 *
 * Approach:
 * A queue can be built on top of a Deque by always adding at the rear (addLast)
 * and removing/peeking from the front (removeFirst / getFirst).
 *
 * Time : O(1) per operation | Space : O(n)
 */
package Queue;
import java.util.*;

public class QueueDeque {
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek="+q.peek());
        q.remove();
        q.remove();
        q.remove();
    }
}
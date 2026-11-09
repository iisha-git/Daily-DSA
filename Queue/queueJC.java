/*
 * Topic : Queue using the Java Collection Framework
 * GFG   : https://www.geeksforgeeks.org/queue-interface-java/
 *
 * Notes:
 * The Queue interface is implemented by LinkedList and ArrayDeque.
 * add()/offer() enqueue, remove()/poll() dequeue, and peek()/element() read the
 * front. This example uses ArrayDeque, which is generally the fastest choice.
 */
//package Queue;

import java.util.*;

public class queueJC {
    public static void main(String[] args) {
        //Queue q = new Queue();
        //Queue <Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

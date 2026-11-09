/*
 * Problem : Reverse a Queue
 * GFG     : https://www.geeksforgeeks.org/reversing-a-queue/
 *
 * Approach:
 * Pop all elements from the queue into a stack, then pop the stack back into the
 * queue. The stack's LIFO order reverses the queue's FIFO order.
 *
 * Time : O(n) | Space : O(n)
 */
package Queue;
import java.util.*;

public class reverseQueue {
    public static void Reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        Reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}

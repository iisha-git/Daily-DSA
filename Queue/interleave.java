/*
 * Problem : Interleave the first half of the queue with the second half
 * GFG     : https://www.geeksforgeeks.org/interleave-first-half-queue-second-half/
 *
 * Approach:
 * 1. Move the first half of the queue into a temporary queue.
 * 2. Repeatedly take one element from the temporary queue and one from the
 *    remaining second half, adding both back to the original queue in order.
 *
 * Time : O(n) | Space : O(n)
 */
package Queue;
import java.util.*;

//o(n)
public class interleave {
    
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> FirstHalf = new LinkedList<>();
        int size  = q.size();
        for (int i = 0; i < size/2; i++) {
            FirstHalf.add(q.remove());
        }
        while(!FirstHalf.isEmpty()){
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);

        while(!q.isEmpty()){
            System.out.println(q.remove()+" ");
        }
        System.out.println();
    }
}

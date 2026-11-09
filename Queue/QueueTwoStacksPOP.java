/*
 * Problem : Implement Queue using Stacks (costly dequeue)
 * LeetCode: https://leetcode.com/problems/implement-queue-using-stacks/
 * GFG     : https://www.geeksforgeeks.org/queue-using-stacks/
 *
 * Approach:
 * Push every element onto s1 (cheap add). For remove/peek, if s2 is empty, move
 * all elements from s1 to s2 (this reverses them), then pop/peek s2. The amortized
 * cost per operation is O(1). (Implementation is incomplete in this file.)
 */
package Queue;
import java.util.*;

public class QueueTwoStacksPOP {
    public class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static int add(int data){
            
        }


    }
}

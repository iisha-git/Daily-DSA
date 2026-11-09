/*
 * Problem : Implement Stack using Queues
 * LeetCode: https://leetcode.com/problems/implement-stack-using-queues/
 * GFG     : https://www.geeksforgeeks.org/implement-stack-using-queue/
 *
 * Approach:
 * Use two queues. For push, add the new element to q2 and move all elements of q1
 * into q2, then swap q1 and q2 so that q1 always has the newest element at its
 * front. pop() and top() then operate on the front of q1.
 *
 * (Implementation is left as an exercise in this file.)
 *
 * Time : push O(n), pop/top O(1) | Space : O(n)
 */
package Stack;

public class StackTwoQueue {
    
}

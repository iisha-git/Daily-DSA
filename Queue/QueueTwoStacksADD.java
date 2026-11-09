/*
 * Problem : Implement Queue using Stacks (costly enqueue)
 * LeetCode: https://leetcode.com/problems/implement-queue-using-stacks/
 * GFG     : https://www.geeksforgeeks.org/queue-using-stacks/
 *
 * Approach:
 * Keep the newest element at the bottom of s1 so that s1 behaves like a queue.
 * On add, move everything from s1 to s2, push the new element onto s1, then move
 * everything back from s2 to s1. remove and peek then simply use s1's top.
 *
 * Time : add O(n), remove/peek O(1) | Space : O(n)
 */
package Queue;

import java.util.*;

public class QueueTwoStacksADD{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
    
} 
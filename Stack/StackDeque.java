/*
 * Problem : Implement Stack using Deque
 * GFG     : https://www.geeksforgeeks.org/implement-stack-using-deque-in-java/
 *
 * Approach:
 * Treat one end of the Deque as the top. push() uses addLast, pop() uses
 * removeLast and peek() uses getLast, which gives LIFO behaviour.
 *
 * Time : O(1) per operation | Space : O(n)
 */
package Stack;

import java.util.*;

public class StackDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek="+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}

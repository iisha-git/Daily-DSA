/*
 * Problem : Implement Stack using ArrayList
 * GFG     : https://www.geeksforgeeks.org/how-to-implement-stack-in-java-using-arraylist/
 *
 * Approach:
 * Use an ArrayList as the underlying storage. push adds to the end, pop removes
 * the last element and peek returns the last element. The end of the list acts as
 * the top of the stack.
 *
 * Time : O(1) per operation (amortized) | Space : O(n)
 */
package Stack;

import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() ==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

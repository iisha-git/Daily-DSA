/*
 * Topic : Stack using the Java Collection Framework
 * GFG   : https://www.geeksforgeeks.org/stack-class-in-java/
 *
 * Notes:
 * java.util.Stack is a legacy LIFO class. push() adds, pop() removes and peek()
 * reads the top. For new code, Deque (ArrayDeque) is usually preferred.
 */
package Stack;
import java.util.*;

public class StackCollectionF {
    public class StackB {
        public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        }
    }
}

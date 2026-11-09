/*
 * Problem : Implement a Queue using a Linked List
 * GFG     : https://www.geeksforgeeks.org/queue-linked-list-implementation/
 *
 * Approach:
 * Keep head (front) and tail (rear) pointers. add() inserts at the tail and
 * remove() deletes the head. An empty queue has both pointers null. All
 * operations take O(1) time.
 *
 * Time : O(1) per operation | Space : O(n)
 */
package Queue;

//import java.util.Queue;

public class queueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
             Node newNode = new Node(data);
             if(isEmpty()){
                head=tail=newNode;
                return;
             }
             tail.next=newNode;
             tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = head =null;
            }else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
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

/*
 * Problem : Design Circular Queue / Queue using Array
 * LeetCode: https://leetcode.com/problems/design-circular-queue/
 * GFG     : https://www.geeksforgeeks.org/circular-queue-set-1-introduction-array-implementation/
 *
 * Approach:
 * Keep front and rear indices in a fixed-size array. add() moves rear forward
 * circularly and remove() moves front forward circularly. The queue is full when
 * (rear + 1) % size == front and empty when both indices are -1. Using modulo
 * keeps the array circular and reuses freed space.
 *
 * Time : O(1) per operation | Space : O(n)
 */
package Queue;

public class queueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear= -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front ==-1; 
        }

        public static boolean isFull(){
            return(rear+1)%size == front;
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //at 1st 
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            
            int result = arr[front];
            
            if(rear==front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

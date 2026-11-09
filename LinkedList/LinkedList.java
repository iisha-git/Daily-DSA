/*
 * Problems demonstrated:
 * - Reverse a Linked List
 *   LeetCode: https://leetcode.com/problems/reverse-linked-list/
 *   GFG     : https://www.geeksforgeeks.org/reverse-a-linked-list/
 * - Remove Nth Node From End of List
 *   LeetCode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *   GFG     : https://www.geeksforgeeks.org/delete-nth-node-from-the-end-of-the-given-linked-list/
 * - Palindrome Linked List
 *   LeetCode: https://leetcode.com/problems/palindrome-linked-list/
 *   GFG     : https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 *
 * Approach:
 * - reverse: iterative three-pointer reversal (prev, curr, next).
 * - deleteNthfromEnd: count the size, walk to the node before the target and
 *   unlink the target.
 * - checkPalindrome: find the middle with slow/fast pointers, reverse the second
 *   half, then compare the two halves.
 *
 * Time : O(n) per operation | Space : O(1)
 */
package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        size++;
        for (int i = 0; i < idx-1; i++) {
            temp= temp.next;
        }

        newNode.next = temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    public int removeLast (){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head; 
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){//remove first
            head = head.next;
            sz--;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //slow fast approach
    public Node findMid(Node head){ // helper for  palindrome
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1 - find mid -slow fast approach
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // head of right half
        Node left = head;

        //step 3 - check if right half is same as left half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    /*
    public static void main(String[]args){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrSearch(3));     
    }
    */

        public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print(); //1->2->3->4->5
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }

}
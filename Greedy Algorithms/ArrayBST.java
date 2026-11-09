/*
 * Problems:
 * - Convert Sorted Array to Balanced BST
 *   LeetCode: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *   GFG     : https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 * - Balance a Binary Search Tree
 *   LeetCode: https://leetcode.com/problems/balance-a-binary-search-tree/
 *   GFG     : https://www.geeksforgeeks.org/normal-bst-to-balanced-bst/
 *
 * Approach:
 * - createBST: the middle element of a sorted array becomes the root, so the left
 *   and right halves recursively form balanced left and right subtrees.
 * - balanceBST: collect the values with an inorder traversal (which is sorted),
 *   then rebuild a balanced BST from that sorted list using the same middle
 *   element strategy.
 *
 * Time : O(n) | Space : O(n)
 */
import java.util.*;

public class ArrayBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//////////////////////////
/// 
/// SORTED ARRAY-> BALANCED BST
/// 
    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print (root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, end);
        return root;
    }
/////////////////////////
/// 
///  BST -> Balanced BST
/// 
    public static void getInorder(Node root,ArrayList <Integer> list){
        if(root==null){
            return;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    
    public static Node createBalanceBST(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBalanceBST(inorder, st, mid-1);
        root.right = createBalanceBST(inorder, mid+1, end);
        return root;
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder); 

        root = createBalanceBST(inorder, 0, inorder.size()-1);
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};

        Node root = createBST(arr, 0, arr.length-1);
        preorder(root);
        System.out.println();
        System.out.println("balance bst");

        // balance bst
        root = balanceBST(root);
        preorder(root);
    }
}

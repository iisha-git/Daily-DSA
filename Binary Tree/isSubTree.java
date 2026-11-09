/*
 * Problem : Subtree of Another Tree
 * LeetCode: https://leetcode.com/problems/subtree-of-another-tree/
 * GFG     : https://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-binary-tree/
 *
 * Approach:
 * - isIdentical: two trees are identical if both are null, or their values match
 *   and their left and right subtrees are identical.
 * - isSubtree: for every node of the main tree whose value equals subRoot's value,
 *   run isIdentical. Return true if any match is identical, or if the subtree is
 *   found in the left or right child.
 *
 * Time : O(n * m) worst case | Space : O(h)
 */
public class isSubTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot == null){
            return true;
        }else if(root ==null || subRoot==null || root.data != subRoot.data){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
            return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(4);
        root.left = new Node(5);
        root.right = new Node(6);

        System.out.println(isSubtree(root, subRoot));
    }
}

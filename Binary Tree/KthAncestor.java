/*
 * Problem : Kth Ancestor of a Node in a Binary Tree
 * GFG     : https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree/
 *
 * Approach:
 * DFS the tree. When the target node is found, start returning its parent; the
 * k-th return value while unwinding the recursion is the k-th ancestor. If no
 * such ancestor exists, return -1.
 *
 * Time : O(n) | Space : O(h)
 */
public class KthAncestor {
    
}

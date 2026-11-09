/*
 * Problem : First and Last Occurrences of X
 * GFG     : https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
 * LeetCode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * Approach in this file (linear scan):
 * Traverse the array once. Record the first index where arr[i] == x and keep
 * updating the last index for every later match. If x is absent both stay -1.
 *
 * Optimized approach: two binary searches (lower bound and upper bound) give
 * O(log n) time on a sorted array.
 *
 * Current time : O(n) | Space : O(1)
 */
package Final450.sortingSearching;
import java.util.*;

class firstLast {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int startIdx =-1;
        int endIdx =-1;
        
        for (int i = 0;i<arr.length;i++){
            
            if(arr[i]==x){
                if(startIdx==-1){
                    startIdx = i;
                }
                endIdx = i;
            }
            
        }
        
        result.add(startIdx);
        result.add(endIdx);
        
        return result;
    }
}

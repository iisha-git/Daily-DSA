/*
 * Problem : Value equal to index value (1-based index)
 * GFG     : https://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/
 *
 * Approach:
 * Traverse the array and collect every element arr[i] that equals i + 1, since
 * the problem uses 1-based indexing. Return the collected values.
 *
 * Time : O(n) | Space : O(k)
 */
package Final450.sortingSearching;
import java.util.*;

class posAndNum {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i =0 ; i<arr.length ;i++){
            if(arr[i]==i+1){
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}

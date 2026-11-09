/*
 * Problem : Find Missing And Repeating
 * GFG     : https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
 * Related : https://leetcode.com/problems/set-mismatch/
 *
 * Approach:
 * 1. Insert every element into a HashSet. If add() returns false, that value is
 *    the repeating number.
 * 2. Iterate from 1 to n and find the value that is missing from the set.
 * Return [repeating, missing].
 *
 * Time : O(n) | Space : O(n)
 */
package Final450.sortingSearching;
import java.util.*;

class findTwoElement {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int missing = 0;
        int repeated = 0;

        for (int num : arr) {
            if (!set.add(num)) {
                repeated = num;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }
        }
        result.add(repeated);
        result.add(missing);

        return result;
    }
}

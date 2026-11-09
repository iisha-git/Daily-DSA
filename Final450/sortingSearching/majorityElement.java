/*
 * Problem : Majority Element (appears more than n/2 times)
 * LeetCode: https://leetcode.com/problems/majority-element/
 * GFG     : https://www.geeksforgeeks.org/majority-element/
 *
 * Approach in this file (HashMap):
 * Count the frequency of every element and return the one whose count is
 * greater than n / 2.
 *
 * Optimized approach (Boyer-Moore Voting, O(1) space):
 * Keep a candidate and a count. Increment the count for the same value,
 * decrement otherwise, and change candidate when the count reaches zero.
 *
 * Current time : O(n) | Space : O(n)
 */
package Final450.sortingSearching;
import java.util.*;

class majorityElement {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > arr.length / 2) {
                return i;
            }
        }

        return -1;
    }
}

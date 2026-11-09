/*
 * Problem : Find a pair with the given difference
 * GFG     : https://www.geeksforgeeks.org/find-a-pair-with-given-difference/
 * Related : https://leetcode.com/problems/k-diff-pairs-in-an-array/
 *
 * Approach:
 * Use a HashSet to remember the numbers seen so far. For every number num,
 * check if (num - x) or (num + x) is already present. If yes, a pair with
 * absolute difference x exists. Otherwise insert num and continue.
 *
 * Time : O(n) | Space : O(n)
 */
package Final450.sortingSearching;
import java.util.*;

class findPair {
    public boolean findPair(int[] arr, int x) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num - x) || set.contains(num + x)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}

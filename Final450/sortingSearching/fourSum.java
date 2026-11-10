/*
 * Problem : 4Sum
 * LeetCode: https://leetcode.com/problems/4sum/
 * GFG     : https://www.geeksforgeeks.org/find-four-numbers-with-sum-equal-to-given-sum/
 *
 * Approach in this file (brute force):
 * Try every combination of four indices using four nested loops. Whenever the
 * four values add up to target, store them in a set so that duplicate
 * quadruplets are counted only once.
 *
 * Optimized approach (sort + two pointers):
 * Sort the array, fix the first two indices with two loops, then use a
 * two-pointer sweep for the remaining two values. Skip duplicates at every
 * level to avoid repeated work.
 *
 * Current time : O(n^4) | Space : O(k)
 */
package Final450.sortingSearching;
import java.util.*;

class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> Result = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {

                        if ((long) nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> temp = new ArrayList<>();

                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);

                            Result.add(temp);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(Result);
    }
}

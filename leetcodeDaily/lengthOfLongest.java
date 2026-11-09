package leetcodeDaily;

import java.util.HashMap;

public class lengthOfLongest {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);            
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}


/*
LeetCode 2958 - Length of Longest Subarray With at Most K Frequency
Difficulty: Medium
LeetCode: https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
GFG     : https://www.geeksforgeeks.org/longest-subarray-having-frequency-of-every-element-less-than-equal-to-k/

Pattern: Sliding Window + HashMap

Concept:
Find the longest contiguous subarray in which every element
appears at most k times.

Approach:
- Maintain a sliding window using two pointers: left and right.
- Move right forward to expand the window.
- HashMap stores the frequency of each element inside the window.
- If the frequency of nums[right] becomes greater than k,
  the window becomes invalid.
- Move left forward and decrease frequencies until the window
  becomes valid again.
- After the window is valid, calculate its length and update max.

Why sliding window works:
The window is always kept valid.
When it becomes invalid, we only need to remove elements
from the left until the frequency constraint is satisfied again.

Window length:
right - left + 1

Example:
nums = [1,2,1,2,1], k = 2

[1,2,1,2] → valid
1 occurs 2 times
2 occurs 2 times

Adding another 1:
[1,2,1,2,1] → invalid
1 occurs 3 times

Shrink from left:
[2,1,2,1] → valid again

Important:
A subarray must be contiguous, so we cannot remove an element
from the middle. We always expand from right and shrink from left.

Time: O(n)
- Each element enters the window once and leaves the window once.

Space: O(n)
- HashMap stores frequencies of elements in the window.

Key recognition:
"Longest/shortest subarray" + "frequency/count constraint"
is a strong signal for Sliding Window + HashMap.
*/
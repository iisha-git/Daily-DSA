/*
 * Problem : Smallest Missing Integer Greater Than Sequential Prefix Sum
 * LeetCode: https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
 *
 * Note: The file is named stoneGame4, but the logic here is LeetCode 2996.
 * Stone Game IV is a different problem:
 * https://leetcode.com/problems/stone-game-iv/
 *
 * Approach:
 * 1. Starting from nums[0], keep adding nums[i] while the array is sequentially
 *    increasing (nums[i] == nums[i - 1] + 1). This is the sequential prefix sum.
 * 2. Starting from that sum, find the first value not present in nums and return it.
 *
 * Time : O(n^2) worst case | Space : O(1)
 */
package leetcodeDaily;

public class stoneGame4 {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            sum = sum+nums[i];
        }
        int missingNum = sum;
        
        while (true) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (nums[i] == missingNum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return missingNum;
            }
            missingNum++;
        }
    }

}

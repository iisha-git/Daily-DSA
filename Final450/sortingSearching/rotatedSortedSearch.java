/*
 * Problem : Search in Rotated Sorted Array
 * LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * GFG     : https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 *
 * Approach (modified binary search):
 * At every step at least one half of the array is sorted.
 * - If nums[low] <= nums[mid], the left half is sorted; check whether the
 *   target lies in [nums[low], nums[mid]) and move the bounds accordingly.
 * - Otherwise the right half is sorted; check whether the target lies in
 *   (nums[mid], nums[high]] and move the bounds accordingly.
 *
 * Time : O(log n) | Space : O(1)
 */
package Final450.sortingSearching;

class rotatedSortedSearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
        
        int mid = low + (high-low)/2;

        if(target==nums[mid]){
            return mid;
        }

        if(nums[low]<=nums[mid]){
            if(target>=nums[low] && target<nums[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }else{
           if(target>nums[mid] && target<=nums[high]){
            low = mid+1;
           }else{
            high=mid-1;
           }
        }
        
    }
    return -1;
    }
}

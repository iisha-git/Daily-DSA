/*
 * Problem : Container With Most Water
 * LeetCode: https://leetcode.com/problems/container-with-most-water/
 * GFG     : https://www.geeksforgeeks.org/container-with-most-water/
 *
 * Approach in this file (brute force):
 * Try every pair of lines (i, j). The water stored is
 * min(height[i], height[j]) * (j - i). Track the maximum over all pairs.
 *
 * Optimal approach (two pointers, O(n)):
 * Start with the widest container (lp = 0, rp = n - 1). The area is limited by
 * the shorter line, so move the shorter pointer inward; moving the taller one
 * can never increase the area.
 *
 * Current time : O(n^2) | Space : O(1)
 *
 * Note: the code computes Math.min(i, j) instead of
 * Math.min(height.get(i), height.get(j)), so it compares indices, not heights.
 */
import java.util.ArrayList;

public class storWater{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater= 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                // O(n)^2
                int ht = Math.min(i, j);
                int width = j-i;
                int waterStored = ht*width;
                maxWater = Math.max(maxWater, waterStored);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        storeWater(height);
    }
}
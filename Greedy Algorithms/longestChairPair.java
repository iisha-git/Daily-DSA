/*
 * Problem : Maximum Length Chain of Pairs
 * LeetCode: https://leetcode.com/problems/maximum-length-of-pair-chain/
 * GFG     : https://www.geeksforgeeks.org/maximum-length-chain-of-pairs-dp-20/
 *
 * Approach (greedy):
 * Sort the pairs by their second value. Start with the first pair, then extend the
 * chain whenever the current pair's first value is greater than the last chosen
 * pair's second value. This is the same idea as the Activity Selection problem.
 *
 * Time : O(n log n) | Space : O(1)
 */
import java.util.*;

public class longestChairPair {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain ="+chainLen);
    }
    
}

/*
 * Problem : Fractional Knapsack
 * GFG     : https://www.geeksforgeeks.org/fractional-knapsack-problem/
 *
 * Approach (greedy):
 * Compute the value/weight ratio of every item, sort the items by ratio in
 * descending order and keep taking items while capacity allows. When an item does
 * not fit completely, take the fraction that fits. This greedy choice is optimal
 * for the fractional version of knapsack.
 *
 * Time : O(n log n) | Space : O(n)
 */

import java.util.*;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;


        //2d array for sorting ratios
        double ratio[][] = new double[val.length][2];
        //0th index -> og index ; 1st col => ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0]=i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //descending order
        Arrays.sort(ratio,Comparator.comparingDouble((double[] o)->o[1]).reversed());//sorting based on 1st index
        
        int capacity = w;
        double finalVal=0;
        for (int i = 0; i < ratio.length; i++) {
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalVal+=val[idx];
                capacity-=weight[idx];
            }else{
                finalVal+=(ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}

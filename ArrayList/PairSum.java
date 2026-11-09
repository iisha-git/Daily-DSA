/*
 * Problem : Pair with given sum in a sorted list (Two Sum II)
 * LeetCode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * GFG     : https://www.geeksforgeeks.org/two-pointers-technique/
 *
 * Approach (two pointers, O(n)):
 * Keep one pointer at the start (lp) and one at the end (rp) of the sorted list.
 * - If list[lp] + list[rp] == target, a valid pair is found.
 * - If the sum is smaller than the target, move lp right to increase the sum.
 * - If the sum is larger than the target, move rp left to decrease the sum.
 * The list must be sorted for this technique to work.
 *
 * Time : O(n) | Space : O(1)
 */
import java.util.ArrayList;

public class PairSum {
    // optimmized - O(n) two pointer approach
    public static boolean PairSum(ArrayList<Integer> List , int target){
        int lp = 0;
        int rp = List.size()-1;
        while(lp!=rp){
            //case 1
            if(List.get(lp)+List.get(rp)==target){
                return true;
            }
            //case 2
            if(List.get(lp)+List.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        PairSum(list,50);
    }
}

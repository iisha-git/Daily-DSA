/*
 * Problem : Pair with given sum in a sorted and rotated list
 * GFG     : https://www.geeksforgeeks.org/find-a-pair-with-given-sum-in-a-sorted-and-rotated-array/
 *
 * Approach:
 * 1. Find the pivot (the largest element where the rotation happens) at index i
 *    where list[i] > list[i + 1].
 * 2. The smallest element is at (pivot + 1) and the largest is at pivot.
 * 3. Apply the two-pointer technique circularly using modulo n:
 *       lp = (lp + 1) % n
 *       rp = (n + rp - 1) % n
 *    and compare the sum of both pointers with the target.
 *
 * Time : O(n) | Space : O(1)
 *
 * Note: In this file the two-pointer logic sits inside the pivot-search loop,
 * so it only runs until the pivot is found. The pointer search should run after
 * the pivot has been located. Left unchanged to preserve the original code.
 */
import java.util.ArrayList;

public class PairSum2 {
    
    public static boolean PairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }

            int lp = bp+1;
            int rp = bp;
            while(lp!=rp){
                //case 1
                if(list.get(lp)+list.get(rp)==target){
                    return true;
                }
                if(list.get(lp)+list.get(rp)<target){
                    lp=(lp+1)%n;
                }else{
                    rp = (n+rp-1)%n;
                }
                
            }
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(PairSum2(list,50));
    }
    
}

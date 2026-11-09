/*
 * Problem : Minimum sum of absolute differences of two arrays
 * GFG     : https://www.geeksforgeeks.org/minimum-sum-absolute-difference-pairs-two-arrays/
 *
 * Approach (greedy):
 * Sort both arrays, pair the smallest elements together, then the next smallest,
 * and so on. For two sorted arrays this pairing minimizes the total absolute
 * difference.
 *
 * Time : O(n log n) | Space : O(1)
 *
 * Note: the current loop overwrites minDiff instead of accumulating it; it should
 * be minDiff += Math.abs(A[i] - B[i]).
 */
import java.util.*;

public class AbsoluteDifferencePair {
    public static void main(String[] args) {
        int A[]= {1,2,3};
        int B[] = { 2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < B.length; i++) {
            minDiff = Math.abs(A[i]-B[i]);
        }
        System.out.println(minDiff);
    }
}

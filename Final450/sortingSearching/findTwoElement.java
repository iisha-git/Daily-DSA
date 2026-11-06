package Final450.sortingSearching;
import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int missing = 0;
        int repeated = 0;

        for (int num : arr) {
            if (!set.add(num)) {
                repeated = num;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }
        }
        result.add(repeated);
        result.add(missing);

        return result;
    }
}

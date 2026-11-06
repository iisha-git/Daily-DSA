package Final450.sortingSearching;
import java.util.*;

class majorityElement {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > arr.length / 2) {
                return i;
            }
        }

        return -1;
    }
}

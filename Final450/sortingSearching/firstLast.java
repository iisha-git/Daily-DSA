package Final450.sortingSearching;
import java.util.*;

class firstLast {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int startIdx =-1;
        int endIdx =-1;
        
        for (int i = 0;i<arr.length;i++){
            
            if(arr[i]==x){
                if(startIdx==-1){
                    startIdx = i;
                }
                endIdx = i;
            }
            
        }
        
        result.add(startIdx);
        result.add(endIdx);
        
        return result;
    }
}

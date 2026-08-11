package leetcodeDaily;

public class stoneGame4 {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            sum = sum+nums[i];
        }
        int missingNum = sum;
        
        while (true) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (nums[i] == missingNum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return missingNum;
            }
            missingNum++;
        }
    }

}

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
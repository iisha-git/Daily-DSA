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

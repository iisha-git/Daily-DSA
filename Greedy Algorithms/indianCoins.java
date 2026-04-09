import java.util.*;

public class indianCoins {
    public static void main(String[] args) {
        Integer currencies[] = {1,2,5,10,20,50,100,500,2000};
        int numberOFNotes = 0;
        Arrays.sort(currencies,Comparator.reverseOrder());
        int amout = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < currencies.length; i++) {
            if(currencies[i]<=amout){
                while (currencies[i]<=amout) {
                    numberOFNotes++;
                    ans.add(currencies[i]);
                    amout-=currencies[i];
                }
            }
        }
        System.out.println("number of notes used : " +numberOFNotes);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }
        System.out.println();
    }
    
}

/*
 * Problem : Minimum cost to cut a chocolate/board into squares
 * GFG     : https://www.geeksforgeeks.org/minimum-cost-cut-board-squares/
 *
 * Approach (greedy):
 * Sort the horizontal and vertical cut costs in descending order. Every cut is
 * multiplied by the number of pieces currently in the perpendicular direction.
 * Always make the more expensive cut first while there are pieces to multiply,
 * because the number of pieces only increases.
 *
 * Time : O(n log n + m log m) | Space : O(1)
 */
import java.util.*;
public class chocolaProblem{
    public static void main(String[] args) {
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2}; 

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h = 0, v =0;
        int hp = 1 , vp=1 ;
        int cost = 0;

        while (h<costHor.length && v<costVer.length) {
            if(costVer[v]<=costHor[h]){
                cost+=(costHor[h]*vp);
                h++;
                hp++;
            }else{
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }

        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = "+ cost);
    }
}
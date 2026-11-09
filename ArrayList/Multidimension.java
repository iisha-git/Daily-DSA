/*
 * Topic  : ArrayList of ArrayLists (2D ArrayList) in Java
 * GFG    : https://www.geeksforgeeks.org/multidimensional-collections-in-java/
 *
 * Approach:
 * Store multiple ArrayList<Integer> objects inside a single outer ArrayList to
 * create a 2D-like structure. Build each inner list in a loop, add all of them
 * to the outer list, then use nested loops to read every element row by row.
 *
 * Time : O(rows * cols) | Space : O(rows * cols)
 */
import java.util.*;
public class Multidimension{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 =new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }            
            System.out.println();
        }
    }
}
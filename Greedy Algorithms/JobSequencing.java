/*
 * Problem : Job Sequencing Problem
 * GFG     : https://www.geeksforgeeks.org/job-sequencing-problem/
 *
 * Approach (greedy):
 * Sort the jobs by profit in descending order. Schedule each job in the latest
 * free slot before its deadline; if a slot is available, add it to the sequence
 * and increase the time. Choosing the most profitable job first gives the maximum
 * total profit when every job takes one unit of time.
 *
 * Time : O(n log n) | Space : O(n)
 */
import java.util.*;

public class JobSequencing{

    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i , int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //ascending order of profit(a-b) for descending (b-a);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++; 
            }
        }
        System.out.println("max jobs = "+seq.size());
        for (int i = 0; i < seq.size() ;i++) {
            System.out.print(seq.get(i)+" ");
        }
    }
}
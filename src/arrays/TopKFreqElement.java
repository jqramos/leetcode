package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElement {

// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for(int i : result){
            System.out.println(i);
        }
    }

     public static int[] topKFrequent(int[] nums, int k) {
        //create a hashmap to store the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        //create a priority queue to store the top k frequent numbers
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        //create an array to store the result
        int[] result = new int[k];
        //loop through the array
        for(int i : nums){
            //check if the map contains the number
            if(map.containsKey(i)){
                //if yes, increment the frequency
                map.put(i, map.get(i) + 1);
            } else {
                //if not, add the number and frequency to the map
                map.put(i, 1);
            }
        }
        //add the keys to the priority queue
        pq.addAll(map.keySet());
        //loop through the priority queue
        for(int i = 0; i < k; i++){
            //add the top k frequent numbers to the result array
            result[i] = pq.poll();
        }
        return result;
    }
}

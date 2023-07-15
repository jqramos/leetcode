package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
    public static void main(String[] args) throws Exception {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        //create a hashmap to store the difference and index
        Map<Integer, Integer> map = new HashMap<>();
        //loop through the array
        for(int i = 0; i < nums.length; i++){
            //difference of target and current value
            int diff = target - nums[i];
            //check if the difference is in the map
            if(map.containsKey(diff)){
                //if yes, return the index of the difference and current index
                return new int[]{map.get(diff), i};
            }
            //if not, add the current value and index to the map
            map.put(nums[i], i);
        }

        //return null if no solution is found
        return null;
    }
}

package arrays;

public class ProductOfArrayExceptSelf {
    /*
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
     * 
     */

     public static void main(String[] args) throws Exception {
         int[] nums = {1,2,3,4};
         int[] result = productExceptSelf(nums);
         for(int i : result){
             System.out.println(i);
         }
     }

     public static int[] productExceptSelf(int[] nums) {
        //create an array to store the result
        int[] result = new int[nums.length];
        //create a variable to store the product of all the elements to the left of the current element
        int left = 1;
        //loop through the array
        for(int i = 0; i < nums.length; i++){
            //store the product of all the elements to the left of the current element
            result[i] = left;
            //update the product of all the elements to the left of the current element
            left *= nums[i];
        }
        //create a variable to store the product of all the elements to the right of the current element
        int right = 1;
        //loop through the array in reverse order
        for(int i = nums.length - 1; i >= 0; i--){
            //store the product of all the elements to the right of the current element
            result[i] *= right;
            //update the product of all the elements to the right of the current element
            right *= nums[i];
        }
        //return the result
        return result;
     }
}

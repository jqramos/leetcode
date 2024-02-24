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
         int arrayLength = nums.length;
         int[] outputArray = new int[arrayLength];

         // Initialize the first element of the output array.
         outputArray[0] = 1;

         // Calculate the product of all the elements to the left of each element.
         for (int i = 1; i < arrayLength; i++) {
             outputArray[i] = nums[i - 1] * outputArray[i - 1];
         }

         // Calculate the product of all the elements to the right of each element.
         int rightProduct = 1;
         for (int i = arrayLength - 1; i >= 0; i--) {
             // Update the output array by multiplying the left product and right product.
             outputArray[i] *= rightProduct;
             // Update the right product.
             rightProduct *= nums[i];
         }

         return outputArray;

     }
}

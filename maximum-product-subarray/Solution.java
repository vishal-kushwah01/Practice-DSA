public class Solution {
    public static int maxProduct(int[] nums){
        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int maxProduct = nums[0];

        for(int i = 0 ; i<nums.length ; i++){
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[n - 1 -i];

            maxProduct = Math.max(maxProduct , Math.max(leftProduct, rightProduct));
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}

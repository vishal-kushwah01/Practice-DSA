public class Solution {
    public static int maxSubarrayCurcularSum(int nums[]){
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int maxSum = kadanesMax(nums);
        int minSum = kadanesMin(nums);

        int circularSum = totalSum - minSum;

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, circularSum);
    } 

    public static int kadanesMax(int nums[]){
        int sum = 0;
        int maxSum = nums[0];

        for(int i = 0 ; i<nums.length ; i++){
            sum = Math.max(nums[i], sum + nums[i]);

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int kadanesMin(int nums[]){
        int sum = 0;
        int minSum = nums[0];

        for(int i = 0 ; i<nums.length ; i++){
            sum = Math.min(nums[i] , sum + nums[i]);

            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }
    public static void main(String[] args) {
        int nums[] = { 5, -3, 5};
        System.out.println(maxSubarrayCurcularSum(nums));
    }
}

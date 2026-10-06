public class Solution {
    public static int SubarrayProductLessThanK(int nums[] , int k){
        if (k <= 0) {
            return 0;
        }

        int product = 1;
        int low = 0;
        int count = 0;

        for(int high = 0 ; high < nums.length ; high++){
            product *= nums[high];

            while (product >= k) {
                product /= nums[low];
                low++;
               
            }

            count += high - low + 1;
        }
        return count;

    }
    public static void main(String[] args) {
        int nums[] = {10 , 5 , 2 ,6};
        int k = 100;
        System.out.println(SubarrayProductLessThanK(nums, k));
    }
}

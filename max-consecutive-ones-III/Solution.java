public class Solution {
    public static int longestOnes(int[] nums , int k){
        int left = 0;
        int countZeroes = 0;
        int maxLen = 0;

        for(int right = 0 ; right < nums.length ; right++){
            if (nums[right] == 0) {
                countZeroes++;
            }

            while (countZeroes > k) {
                if (nums[left] == 0) {
                    countZeroes--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println("maximum consecutive ones after rotating k value -  " + longestOnes(nums, k));
    }
}

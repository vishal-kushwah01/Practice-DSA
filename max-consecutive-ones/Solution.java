public class Solution {
    public static int longestOnes(int[] nums){
        int left = 0;
        int maxLen = 0;

        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0){
                left = right + 1;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1 , 1 , 0 , 1 , 1 ,1};
        System.out.println("Maximum length of consecutive Ones - " + longestOnes(nums));
    }
}

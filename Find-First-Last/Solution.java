public class Solution {

    public int[] SearchRange(int[] nums , int target){
        int left = findFirst(nums, target);
        int right = findLast(nums, target);
        return new int[] {left , right};
    }

    private int findFirst(int[] nums , int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid-1;
            } else if(nums[mid] < target){
                left = mid+1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums , int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = s.SearchRange(nums, target);
        System.out.println("[ " + result[0] + " , " + result[1] + " ]");
    }
}

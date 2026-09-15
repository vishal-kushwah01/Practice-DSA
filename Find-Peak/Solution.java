class Solution {
    public int findPeak(int nums[]){
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int mid = left + (right - left)/2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else{
                right = mid;
            }
        }
        return nums[left];
    }

   
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {1,2,3,1};
        System.out.println(s.findPeak(nums));
       
    }
}

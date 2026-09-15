public class MaxSubarray {
    public  static int FindMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currsum = currsum + nums[i];
            max = Math.max(currsum, max);
            if (currsum < 0) {
                currsum = 0;
            }

        }

        return max;

    }
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(FindMax(nums));
    }
}

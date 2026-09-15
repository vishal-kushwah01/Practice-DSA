public class Solution {
    public static double findMedian(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedian(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            int partition1 = low + (high - low) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;

            int maxleft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minright1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxleft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minright2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            if (maxleft1 <= minright2 && maxleft2 <= minright1) {

                if ((m + n) % 2 == 0) {

                    return (Math.max(maxleft1, maxleft2) + Math.min(minright1, minright2)) / 2.0;
                } else {
                    return Math.max(maxleft1, maxleft2);
                }
            }

            else if (maxleft1 > minright2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2, 15, 26, 38 };
        int[] nums2 = { 2, 13, 17, 30, 45, 60 };
        double result = findMedian(nums1, nums2);
        System.out.println("Median is :- " + result);

    }
}

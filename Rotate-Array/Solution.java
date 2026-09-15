import java.util.*;

class Solution{

public void rotate(int nums[] , int k) {
    int n = nums.length;
    k = k%n;

    if (n <= 1 || k == 0) {
        return;
    }
    reverse(nums, 0, n-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, n-1);

}

private void reverse(int nums[] , int start , int end){


    while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    
}

public static void main(String[] args) {
    Solution solver = new Solution();

    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;

    
    System.out.println("Original: " + Arrays.toString(nums));

    solver.rotate(nums, k);

    
    System.out.println("Rotated:  " + Arrays.toString(nums));
}

}
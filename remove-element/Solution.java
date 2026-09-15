public class Solution {
    public static int removeElement(int[] nums , int val){
        int j = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] != val ){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public  static void print(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int newlength = removeElement(nums, val);
        System.out.println("New length: " + newlength);
        System.out.print("Modified array: ");
        print(nums);
    }
   
}

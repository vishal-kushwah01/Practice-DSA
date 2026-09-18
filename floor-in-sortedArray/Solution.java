
public class Solution {
    public static int findFloor(int num[] , int x){
        int left = 0;
        int right = num.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (num[mid] <= x) {
                ans = mid;
                left = mid+1;
            } else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num[] = {1,2,8,10,10,12,19};
        int x = 5;
        System.out.println(findFloor(num, x));
    }
    
}
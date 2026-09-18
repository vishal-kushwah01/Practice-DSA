public class Solution {
    public static int Countfreq(int arr[] , int target){
        int first = findFirst(arr , target);
        int last = findLast(arr , target);
        return last - first + 1;
    }

    private static int findFirst(int arr[] , int target){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                ans = mid;
                right = mid-1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    
    private static int findLast(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        int target = 2;
        System.out.println(Countfreq(arr, target));
    }
}

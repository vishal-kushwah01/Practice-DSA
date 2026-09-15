public class Solution {
    public static String reverseWords(String s){

        char[] arr = s.toCharArray();
        int left = 0;
        for(int right = 0 ; right <= arr.length ; right++){
            if (right == arr.length || arr[right] == ' ') {
                reverse(arr, left, right-1);
                left = right + 1;
            }
        }

        return new String(arr);

    }
    private static void reverse(char[] arr , int left , int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseWords(s));
    }
}

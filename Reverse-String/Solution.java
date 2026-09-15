public class Solution {

    public void reverseString(char[] s){
        int left = 0;
        int right = s.length-1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
    public static void print(char[] s){
        for(int i = 0 ; i<s.length ; i++){
            System.out.print(s[i] + " ");
        }System.out.println();

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(s);
        print(s);
    }
}

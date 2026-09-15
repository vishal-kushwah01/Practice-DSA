public class PalindromeNumber {
    public static boolean CheckPalindrome(int x){
        if(x < 0){
            return false;
        }
        int temp = x;
        int revNum = 0;
        while (x > 0) {
            int digit = x%10;
            revNum = revNum * 10 + digit;
            x = x/10;
        }
        if (temp == revNum) {
            return true;
        }
        return false;


    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(CheckPalindrome(x));
    }
}

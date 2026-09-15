public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while (left < right && !Character.isLetterOrDigit(left)) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(right)) {
                right++;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

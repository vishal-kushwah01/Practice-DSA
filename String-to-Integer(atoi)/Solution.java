public class Solution {

    //  {#977,4}
    //important
    // convert string to integer :- digit = s.charAt() - '0';
    // if (num > (Integer.MAX_VALUE - digit) / 10) {
    //return(sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;



    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        int num = 0;

        // whitespace remove

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // signedness

        if (i < n && s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // convert and round

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;

        }

        return (int) (sign * num);
    }

    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));
    }
}

//Using string conversion method
public class Palindrome {
    public boolean isPalindrome(int x) {
        // check for negative numbers
        if (x < 0) {
            return false;
        }
        // convert to a string
        String myStr = Integer.toString(x);

        // reverse the string
        String reversed = new StringBuilder(myStr).reverse().toString();

        // compare the two
        return myStr.equals(reversed);
    }
}

// Using Mathematical operation
public class Solution {
    public boolean isPalindrome(int x) {
        // If it's negative or ends in zero
        if ((x < 0) || ((x != 0) && (x % 10 == 0))) {
            return false;
        }

        // Reverse second half of the number
        int reversedHalf = 0;

        // loop upto the middle , x <= reversedHalf
        while (x > reversedHalf) {
            // 1. Shift existing digits left (* 10)
            // 2. Add the last digit of x (+ x % 10)
            reversedHalf = (reversedHalf * 10) + (x % 10);

            // remove the last digit
            x = x / 10;

        }
        // Compare the Halves
        // 1. x == reversedHalf: for numbers with an EVEN digit count
        // 2. x == reversedHalf / 10: Used for numbers with an ODD digit count (e.g.,
        // 121 -> x=1, reversedHalf=12. remove the middle digit: 12/10=1)
        return x == reversedHalf || x == (reversedHalf / 10);
    }
}
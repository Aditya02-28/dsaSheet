package Basics;

public class palindrome {
    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int revNum = 0;
        int dup = x;

        while (x > 0) {
            int lastDigit = x % 10;
            revNum = revNum * 10 + lastDigit;
            x /= 10;
        }

        return dup == revNum;
    }

    public static void main(String[] args) {

        int num = 121;

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}
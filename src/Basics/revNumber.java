package Basics;

public class revNumber {

    // Function to reverse a number
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev;
    }

    // Main method
    public static void main(String[] args) {
        int x = 1234;

        int result = reverse(x);
        System.out.println("Reversed Number: " + result);
    }
}

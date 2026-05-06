package Basics;

public class lengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "Hello World";

        int ans = lengthOfLastWord(s);

        System.out.println("Length of last word: " + ans);
    }
}
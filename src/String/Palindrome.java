package String;

public class Palindrome {
    public static void main(String[] args) {

        // check if a word or sentence is palindrome i.e. when reversed, the sequence of character remains same
        // in case of a sentence, you need to remove whitespaces, and punctuations
//        String s = "madam";
        String s = "A man, a plan, a canal, Panama";
        System.out.println(palinDromeCheckString(s));


    }

    /**
     * Checks if string is palindrome using two pointer technique
     * @param s
     * @return
     */
    public static String palinDromeCheckString(String s) {
        s = s.replaceAll("\\s+","").replaceAll("\\W+","").toLowerCase();
        boolean isPalindrome = true;

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                isPalindrome = false;
                break;
            }
            leftPointer++;
            rightPointer--;
        }

        return isPalindrome ? "PALINDROME" : "NOT PALINDROME";
    }
}

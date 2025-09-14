package Palindrome;

import java.util.stream.IntStream;

public class PalindromeT {
    public static void main(String[] args) {
        Boolean flag = checkPalindrome("madam");
        System.out.println("String is Palindrome " + flag);
        System.out.println("String is Palindrome " + checkPalindrome("rachit"));
        System.out.println("String is Palindrome " + checkPalindrome("raar"));
        System.out.println("String is Palindrome " + checkPalindrome("qwertyytrewq"));


        System.out.println("String is Palindrome useSecondMethod " + useSecondMethod("rachit"));
        System.out.println("String is Palindrome useSecondMethod " + useSecondMethod("raar"));
        System.out.println("String is Palindrome useSecondMethod " + useSecondMethod("qwertyytrewq"));


        System.out.println("String is Palindrome isPalindrome " + isPalindrome("rachit"));
        System.out.println("String is Palindrome isPalindrome " + isPalindrome("raar"));
        System.out.println("String is Palindrome isPalindrome " + isPalindrome("qwertyytrewq"));
    }

    public static Boolean checkPalindrome(String s) {
        String rev = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            rev = s.charAt(i) + rev;

        }
        if (s.equals(rev)) {
            return true;
        }


        return false;
    }
// Secounf

    public static Boolean useSecondMethod(String s) {
        String str = new StringBuilder(s).reverse().toString();
        if (s.equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String input) {
        String str = input;


        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
    }

}

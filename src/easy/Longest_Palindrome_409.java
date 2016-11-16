package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * <p>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * <p>
 * Example:
 * <p>
 * Input:
 * "abccccdd"
 * <p>
 * Output:
 * 7
 * <p>
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * Subscribe to see which companies asked this question
 */
public class Longest_Palindrome_409 {
    /**
     * Now let me explain the solution and also why it works.
     * <p>
     * A palindrome can have odd or even number of characters.
     * <p>
     * a. When the length of palindrome is even, all the characters must have appeared even number of times.
     * b. When the length of palindrome is odd, all characters must have appeared even number of times, but one character would have appeared odd number of times.
     * <p>
     * So, first we calculate the count of characters that have appeared odd number of times. now we can still use these characters in the palindrome, but we cannot use all instances. We can only use even number of occurrences of it.
     * <p>
     * ex: if 'a' appears 3 times, we can still use 'a' to form a palindrome by taking 2 of them.
     * <p>
     * So we subtract the count of characters that are occurring odd number of times.
     * <p>
     * Once that is calculated, we can still use one of the characters odd number of times, we add one to the length of the longest palindrome if the number of characters which have appeared odd number times is more than zero.
     * <p>
     * Lets take an example:
     * <p>
     * Given String is "aaab".
     * <p>
     * When we calculate the count, we get
     * <p>
     * a = 3
     * b = 1
     * <p>
     * so we have two characters which appear odd number of times. so 4 - 2 = 2.
     * <p>
     * But note that the longest palindrome that can be formed is of length 3.
     * <p>
     * meaning, we can use one character which has appeared odd number of times as part of the palindrome.
     * <p>
     * Hence we add one to the length.
     */
    public int longestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return 0;

        int[] count = new int['z' - 'A' + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ++count[c - 'A'];
        }
        int odd = 0;
        for (char c = 'A'; c <= 'z'; c++) {
            if ((count[c - 'A'] & 1) != 0) {
                ++odd;
            }
        }
        return s.length() - odd + (odd > 0 ? 1 : 0);
    }

    public int longestPalindrome1(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] map = new int[128];
        char[] chars = s.toCharArray();
        int res = 0;
        boolean hasOdd = false;
        for (char c : chars) map[c]++;
        for (int i = 0; i < 128; i++) {
            if (map[i] % 2 == 0) res += map[i];
            else {
                res += map[i] - 1;
                hasOdd = true;
            }
        }
        return hasOdd ? res + 1 : res;
    }
}

package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/find-the-difference/
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Find the letter that was added in t.
 * <p>
 * Example:
 * <p>
 * Input:
 * s = "abcd"
 * t = "abcde"
 * <p>
 * Output:
 * e
 * <p>
 * Explanation:
 * 'e' is the letter that was added.
 */
public class Find_Difference_389 {
    public char findTheDifferenceV1(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1 += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            sum2 += t.charAt(i);
        }
        int a = sum2 - sum1;
        char c = (char) (a);
        return c;


    }

    public char findTheDifferenceV2(String s, String t) {
        char diffChar = 0;
        String both = s + t;

        for (char st : both.toCharArray()) {
            diffChar ^= st;
        }

        return diffChar;
    }
}
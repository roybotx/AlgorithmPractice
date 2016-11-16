package easy; /**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/reverse-string/
 * 344. Reverse String   QuestionEditorial Solution  My Submissions
 * Total Accepted: 107870
 * Total Submissions: 188071
 * Difficulty: Easy
 * Contributors: Admin
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */
public class Reverse_String_344 {
    public String reverseString(String s) {
        StringBuilder stringToReturn = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringToReturn.append(s.charAt(s.length() - i - 1));
        }
        return stringToReturn.toString();
    }
}

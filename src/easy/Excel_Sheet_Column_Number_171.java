package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result *= 26;
            result += ((s.charAt(i) - 'A') + 1);
        }
        return result;
    }
}

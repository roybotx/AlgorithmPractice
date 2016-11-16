package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/add-digits/
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class Add_Digits_258 {
    public int addDigitsV1(int num) {
        if (num < 10) {
            return num;
        } else {
            int sum = 0;
            sum += num % 10;
            num /= 10;
            sum += num;
            return addDigitsV1(sum);
        }
    }

    public int addDigitsV2(int num) {

        return num==0?0:(num%9==0?9:(num%9));

    }

}

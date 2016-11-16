package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
 * <p>
 * Note:
 * <p>
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class Add_Strings_415 {
    public String addStrings1(String num1, String num2) {
        // suppose num1 is shorter
        if (num1.length() > num2.length()) return addStrings1(num2, num1);
        char[] arr1 = num1.toCharArray(), arr2 = num2.toCharArray();
        int len1 = arr1.length, len2 = arr2.length, carry = 0;
        for (int i = 0; i < len2; ++i) {
            int idx1 = len1 - i - 1, idx2 = len2 - i - 1;

            if (idx1 >= 0) arr2[idx2] += (arr1[idx1] - '0' + carry);
            else if (carry == 0) break;
            else arr2[idx2] += carry;

            if (arr2[idx2] > '9') {
                carry = 1;
                arr2[idx2] -= 10;
            } else carry = 0;
        }
        return carry == 1 ? "1".concat(String.valueOf(arr2)) : String.valueOf(arr2);
    }

    public String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        StringBuilder s = new StringBuilder();
        int sum = 0, carry = 0;

        while (len1 >= 0 || len2 >= 0) {
            int first = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int second = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            sum = carry + first + second;
            s.insert(0, sum % 10);
            carry = sum / 10;
            len1--;
            len2--;
        }

        if (carry > 0)
            s.insert(0, carry);

        return s.toString();
    }
}

package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class Power_of_Two_231 {
    public boolean isPowerOfTwo(int n) {
        /**
         * 3: 0011, -4: 1100, -3: 1101
         * 6: 0110, -7: 1001, -6: 1010
         * num & -num: least significant non-zero digit
         */
        return n > 0 && n == (n & -n);
    }

    public boolean isPowerOfTwo1(int n) {
        double n_d = (double) n;
        while (n_d >= 2) {
            n_d = n_d / 2.0;
        }
        return n_d == 1.0;
    }

    public boolean isPowerOfTwo2(int n) {

        if (n == 0) return false;


        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1)
            return true;

        return false;

    }
}

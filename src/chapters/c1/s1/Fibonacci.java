package chapters.c1.s1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * This is for C1S1 exercise 1.1.19
 * 1.1.19 Run the following program on your computer:
 * public class Fibonacci
 * {
 * public static long F(int N)
 * {
 * if (N == 0) return 0;
 * if (N == 1) return 1;
 * return F(N-1) + F(N-2);
 * }
 * public static void main(String[] args)
 * {
 * for (int N = 0; N < 100; N++)
 * StdOut.println(N + " " + F(N));
 * }
 * }
 * What is the largest value of N for which this program takes less 1 hour to compute the
 * value of F(N)? Develop a better implementation of F(N) that saves computed values in
 * an array.
 */

public class Fibonacci {
    /**
     * This is for how to populate the largest number of fibonacci
     */
    public static void populate(){
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        String last = null;
        try {
            for (long count = 1; ; count++) {
                BigInteger c = a.add(b);
                last = c.toString();
                a = b;
                b = c;
                if (count % 10000 == 0)
                    System.out.println("... " + count);
            }
        } catch (Throwable e) {
            System.out.println("The largest value which was calculated was");
            System.out.println(last);
        }
    }
}

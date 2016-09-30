import chapters.c1.s1.C1s1;
import chapters.c1.s1.Fibonacci;

import java.math.BigInteger;

public class Main {

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        C1s1.printScore();
    }
}

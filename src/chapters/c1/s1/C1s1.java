package chapters.c1.s1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by royxia01 on 9/29/2016.
 */
public class C1s1 {
    /**
     * 1.1.1
     * Give the value of each of the following expressions:
     * a. ( 0 + 15 ) / 2
     * b. 2.0e-6 * 100000000.1
     * c. true && false || true && true
     */
    public static void giveValues() {
        float a = (0 + 15) / 2;
        double b = 2.0e-6 * 100000000.1;
        boolean c = true && false || true && true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /**
     * 1.1.2
     * Give the type and value of each of the following expressions:
     * a. (1 + 2.236)/2
     * b. 1 + 2 + 3 + 4.0
     * c. 4.1 >= 4
     * d. 1 + 2 + "3"
     */
    public static void giveValues2() {
        double a = (1 + 2.236) / 2;
        double b = 1 + 2 + 3 + 4.0;
        boolean c = 4.1 >= 4;
        String d = 1 + 2 + "3";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    /**
     * 1.1.3
     * Write a program that takes three integer command-line arguments and prints
     * equal if all three are equal, and not equal otherwise.
     */
    public static void areTheyEquivalent(int a, int b, int c) {
        if (a == b && b == c)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }

    /**
     * 1.1.4
     * What (if anything) is wrong with each of the following statements?
     * a. if (a > b) then c = 0;
     * b. if a > b { c = 0; }
     * c. if (a > b) c = 0;
     * d. if (a > b) c = 0 else b = 0;
     */
    /**
     * Answer:
     * a. then is not a valid keyword
     * b. IF statement is missing an executable part, remove the braces
     * c. Good
     * d. Good
     */

    /**
     * 1.1.5
     * Write a code fragment that prints true if the double variables x and y are both
     * strictly between 0 and 1 and false otherwise.
     */
    public static void inRange(float x, float y) {
        if (x > 0 && x < 1 && y > 0 && y < 1)
            System.out.println("true");
        else
            System.out.println("false");
    }

    /**
     * 1.1.6
     * What does the following program print?
     * int f = 0;
     * int g = 1;
     * for (int i = 0; i <= 15; i++)
     * {
     * StdOut.println(f);
     * f = f + g;
     * g = f - g;
     * }
     */
    public static void printSomething() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    /**
     * 1.1.7
     * Give the value printed by each of the following code fragments:
     * a. double t = 9.0;
     * while (Math.abs(t - 9.0/t) > .001)
     * t = (9.0/t + t) / 2.0;
     * StdOut.printf("%.5f\n", t);
     * b. int sum = 0;
     * for (int i = 1; i < 1000; i++)
     * for (int j = 0; j < i; j++)
     * sum++;
     * StdOut.println(sum);
     * c. int sum = 0;
     * for (int i = 1; i < 1000; i *= 2)
     * for (int j = 0; j < N; j++)
     * sum++;
     * StdOut.println(sum);
     */
    public static void printSomething2(int N) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%.5f\n", t);
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < N; j++)
                sum++;
        System.out.println(sum);
    }

    /**
     1.1.8
     What do each of the following print?
     a. System.out.println('b');
     b. System.out.println('b' + 'c');
     c. System.out.println((char) ('a' + 4));
     Explain each outcome.
     */
    /**
     * a. b - print a char
     * b. bc - 2 chars plus become a string
     * c. e - ascii of a plus 4, still a char, 'e'
     */

    /**
     * 1.1.9
     * Write a code fragment that puts the binary representation of a positive integer N
     * into a String s.
     * Solution: Java has a built-in method Integer.toBinaryString(N) for this job, but
     * the point of the exercise is to see how such a method might be implemented. Here is a
     * particularly concise solution:
     * String s = "";
     * for (int n = N; n > 0; n /= 2)
     * s = (n % 2) + s;
     */
    public static void intToBiString(int x) {
        String res = "";
        for (int n = x; n > 0; n /= 2)
            res = (n % 2) + res;
        System.out.println(res);
    }

    /**
     * 1.1.10
     * What is wrong with the following code fragment?
     * int[] a;
     * for (int i = 0; i < 10; i++)
     * a[i] = i * i;
     * Solution: It does not allocate memory for a[] with new. This code results in a
     * variable a might not have been initialized compile-time error.
     */
    /**
     * Answer: a doesn't get instantiated
     */

    /**
     * 1.1.11
     * Write a code fragment that prints the contents of a two-dimensional boolean
     * array, using * to represent true and a space to represent false. Include row and column
     * numbers.
     */
    public static void printTwoDimensionalBooleanArray() {
        boolean[][] res = {
                {true, false, true, false},
                {true, true, true},
                {false},
                {true, false, false, false}
        };

        for (boolean[] temp : res) {
            for (boolean item : temp)
                System.out.println(item ? "*" : " ");
        }
    }


    /**
     1.1.12
     What does the following code fragment print?
     int[] a = new int[10];
     for (int i = 0; i < 10; i++)
     a[i] = 9 - i;
     for (int i = 0; i < 10; i++)
     a[i] = a[a[i]];
     for (int i = 0; i < 10; i++)
     System.out.println(i);
     */
    /**
     * Answer:
     * 0123443210
     */
    public static void printWierdArray() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i : a)
            System.out.println(i);
    }

    /**
     * 1.1.13
     * Write a code fragment to print the transposition (rows and columns changed)
     * of a two-dimensional array with M rows and N columns.
     */
    public static void transpositeRowCol() {
        int M = 4;
        int N = 3;
        boolean[][] original = new boolean[][]{
                {true, false, true},
                {true, true, true},
                {false, false, false},
                {true, false, false}
        };

        for (boolean[] temp : original) {
            for (boolean item : temp)
                System.out.print(item ? "*" : "^");
            System.out.println();
        }

        boolean[][] res = new boolean[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                res[j][i] = original[i][j];
            }
        }

        for (boolean[] temp : res) {
            for (boolean item : temp)
                System.out.print(item ? "*" : "^");
            System.out.println();
        }

    }


    /**
     * 1.1.14 Write a static method lg() that takes an int value N as argument and returns
     * the largest int not larger than the base-2 logarithm of N. Do not use Math.
     */
    public static int lg(int N) {
        if (N == 0)
            return -1;
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        int difference = N - 2;
        int track = 2;
        int counter = 1;
        for (int i = 0; i < N; i++) {
            track *= 2;
            if ((N - track) < difference)
                difference = N - track;
            if (track > N)
                return counter;
            counter++;
        }
        return 0;
    }


    /**
     * 1.1.15
     * Write a static method histogram() that takes an array a[] of int values and
     * an integer M as arguments and returns an array of length M whose ith entry is the number
     * of times the integer i appeared in the argument array. If the values in a[] are all
     * between 0 and M–1, the sum of the values in the returned array should be equal to
     * a.length.
     */
    public static int histogram(int[] a, int M) {
        int[] rArray = new int[M];
        for (int i : rArray)
            i = 0;
        for (int i = 0; i < a.length; i++)
            rArray[a[i]]++;

        int sum = 0;
        for (int i : rArray)
            sum += i;
        System.out.println(sum);
        return 0;
    }

    /**
     * 1.1.16
     * Give the value of exR1(6):
     * public static String exR1(int n)
     * {
     * if (n <= 0) return "";
     * return exR1(n-3) + n + exR1(n-2) + n;
     * }
     */
    /**
     * Answer: 311361142246
     */
    /**
     1.1.17 Criticize the following recursive function:
     public static String exR2(int n)
     {
     String s = exR2(n-3) + n + exR2(n-2) + n;
     if (n <= 0) return "";
     return s;
     }
     Answer : The base case will never be reached. A call to exR2(3) will result in calls to
     exR2(0), exR2(-3), exR3(-6), and so forth until a StackOverflowError occurs.
     */

    /**
     * 1.1.18 Consider the following recursive function:
     * public static int mystery(int a, int b)
     * {
     * if (b == 0) return 0;
     * if (b % 2 == 0) return mystery(a+a, b/2);
     * return mystery(a+a, b/2) + a;
     * }
     * What are the values of mystery(2, 25) and mystery(3, 11)? Given positive integers
     * a and b, describe what value mystery(a, b) computes. Answer the same question, but
     * replace + with * and replace return 0 with return 1.
     */
    /**
     * Answer:  Fuck, this is too many layers of recurse
     */

    /**
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
    /**
     * Please refer to Fibonacci.class
     */


    /**
     * 1.1.20 Write a recursive static method that computes the value of ln (N !)
     */
    public static int computeLnN(int n) {
        return 1;
    }

    /**
     * 1.1.21
     * Write a program that reads in lines from standard input with each line containing
     * a name and two integers and then uses printf() to print a table with a column of
     * the names, the integers, and the result of dividing the first by the second, accurate to
     * three decimal places. You could use a program like this to tabulate batting averages for
     * baseball players or grades for students.
     */
    public static void printScore() {
        Scanner s = new Scanner(System.in);
        String line;
        Map<String, String> map = new HashMap<>();
        while (s.hasNextLine() && !(line = s.nextLine()).equals("")) {
            String[] tokens = line.split(" ");
            int score = Integer.valueOf(tokens[1]) / Integer.valueOf(tokens[2]);
            map.put(tokens[0], String.valueOf(score));
        }
        System.out.println("Name\tScore");
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
    /**
     1.1.22
     Write a version of BinarySearch that uses the recursive rank() given on page
     25 and traces the method calls. Each time the recursive method is called, print the argument
     values lo and hi, indented by the depth of the recursion. Hint: Add an argument
     to the recursive method that keeps track of the depth.
     */


    /**
     1.1.23
     Add to the BinarySearch test client the ability to respond to a second argument:
     + to print numbers from standard input that are not in the whitelist, - to print
     numbers that are in the whitelist.
     */

    /**
     1.1.24
     Give the sequence of values of p and q that are computed when Euclid’s algorithm
     is used to compute the greatest common divisor of 105 and 24. Extend the code
     given on page 4 to develop a program Euclid that takes two integers from the command
     line and computes their greatest common divisor, printing out the two arguments for
     each call on the recursive method. Use your program to compute the greatest common
     divisor or 1111111 and 1234567.
     */

    /**
     1.1.25 Use mathematical induction to prove that Euclid’s algorithm computes the
     greatest common divisor of any pair of nonnegative integers p and q.
     CREATIVE PROBLEMS
     */

    /**
     1.1.26
     Sorting three numbers. Suppose that the variables a, b, c, and t are all of the
     same numeric primitive type. Show that the following code puts a, b, and c in ascending
     order:
     if (a > b) { t = a; a = b; b = t; }
     if (a > c) { t = a; a = c; c = t; }
     if (b > c) { t = b; b = c; c = t; }
     */

    /**
     1.1.27
     Binomial distribution. Estimate the number of recursive calls that would be
     used by the code
     public static double binomial(int N, int k, double p)
     {
     if ((N == 0) || (k < 0)) return 1.0;
     return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1);
     }
     to compute binomial(100, 50). Develop a better implementation that is based on
     saving computed values in an array.
     */


    /**
     1.1.28
     Remove duplicates. Modify the test client in BinarySearch to remove any duplicate
     keys in the whitelist after the sort.
     */

    /**
     1.1.29 Equal keys. Add to BinarySearch a static method rank() that takes a key and
     a sorted array of int values (some of which may be equal) as arguments and returns the
     number of elements that are smaller than the key and a similar method count() that
     returns the number of elements equal to the key. Note : If i and j are the values returned
     by rank(key, a) and count(key, a) respectively, then a[i..i+j-1] are the values in
     the array that are equal to key.
     */

    /**
     1.1.30
     Array exercise. Write a code fragment that creates an N-by-N boolean array
     a[][] such that a[i][j] is true if i and j are relatively prime (have no common factors),
     and false otherwise.
     */

    /**
     1.1.31
     Random connections. Write a program that takes as command-line arguments
     an integer N and a double value p (between 0 and 1), plots N equally spaced dots of size
     .05 on the circumference of a circle, and then, with probability p for each pair of points,
     draws a gray line connecting them.
     */


    /**
     1.1.32
     Histogram. Suppose that the standard input stream is a sequence of double
     values. Write a program that takes an integer N and two double values l and r from the
     command line and uses StdDraw to plot a histogram of the count of the numbers in the
     standard input stream that fall in each of the N intervals defined by dividing (l , r) into
     N equal-sized intervals.
     */

    /**
     1.1.33
     Matrix library. Write a library Matrix that implements the following API:
     public class Matrix
     static double dot(double[] x, double[] y) vector dot product
     static double[][] mult(double[][] a, double[][] b) matrix-matrix product
     static double[][] transpose(double[][] a) transpose
     static double[] mult(double[][] a, double[] x) matrix-vector product
     static double[] mult(double[] y, double[][] a) vector-matrix product
     Develop a test client that reads values from standard input and tests all the methods.
     */

    /**
     1.1.34
     Filtering. Which of the following require saving all the values from standard
     input (in an array, say), and which could be implemented as a filter using only a fixed
     number of variables and arrays of fixed size (not dependent on N)? For each, the input
     comes from standard input and consists of N real numbers between 0 and 1.
     ■ Print the maximum and minimum numbers.
     ■ Print the median of the numbers.
     ■ Print the k th smallest value, for k less than 100.
     ■ Print the sum of the squares of the numbers.
     ■ Print the average of the N numbers.
     ■ Print the percentage of numbers greater than the average.
     ■ Print the N numbers in increasing order.
     ■ Print the N numbers in random order.
     */

    /**
     EXPERIMENTS
     1.1.35
     Dice simulation. The following code computes the exact probability distribution
     for the sum of two dice:
     int SIDES = 6;
     double[] dist = new double[2*SIDES+1];
     for (int i = 1; i <= SIDES; i++)
     for (int j = 1; j <= SIDES; j++)
     dist[i+j] += 1.0;
     for (int k = 2; k <= 2*SIDES; k++)
     dist[k] /= 36.0;
     The value dist[i] is the probability that the dice sum to k. Run experiments to validate
     this calculation simulating N dice throws, keeping track of the frequencies of occurrence
     of each value when you compute the sum of two random integers between 1
     and 6. How large does N have to be before your empirical results match the exact results
     to three decimal places?
     */

    /**
     1.1.36
     Empirical shuffle check. Run computational experiments to check that our
     shuffling code on page 32 works as advertised. Write a program ShuffleTest that takes
     command-line arguments M and N, does N shuffles of an array of size M that is initialized
     with a[i] = i before each shuffle, and prints an M-by-M table such that row i
     gives the number of times i wound up in position j for all j. All entries in the array
     should be close to N/M.
     */

    /**
     1.1.37
     Bad shuffling. Suppose that you choose a random integer between 0 and N-1
     in our shuffling code instead of one between i and N-1. Show that the resulting order is
     not equally likely to be one of the N! possibilities. Run the test of the previous exercise
     for this version.
     */

    /**
     1.1.38
     Binary search versus brute-force search. Write a program BruteForceSearch
     that uses the brute-force search method given on page 48 and compare its running time
     on your computer with that of BinarySearch for largeW.txt and largeT.txt.
     */

    /**
     1.1.39 Random matches. Write a BinarySearch client that takes an int value T as
     command-line argument and runs T trials of the following experiment for N = 103, 104,
     105, and 106: generate two arrays of N randomly generated positive six-digit int values,
     and find the number of values that appear in both arrays. Print a table giving the average
     value of this quantity over the T trials for each value of N.
     */
}

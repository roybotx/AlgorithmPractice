package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class Power_of_Three_326 {
    /**
     * SOLUTION 1
     */

    public class Solution {
        public boolean isPowerOfThree1(int n) {
            return Integer.toString(n, 3).matches("^10*$");
        }
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number. `b` in this case would be `3`.

     Time Complexity:

     Best Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Average Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Auxiliary Space:

     Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input. The extra space is needed to store the equivalent string of base `3`.
     Algorithm

     Approach: Base Conversion (Built-in Library)

     The algorithm assumes that the built-in library of base conversion is implemented as a series of dividing and modding. In addition, the algorithm also assumes that the string matching library is implemented in linear time where the whole string is iterated.

     The algorithm make use of the basic property of number representation in specific base. This table shows base `3` representations of various power of three.

     Base `10`	Base `3` (`8` Bits)	Calculation
     `3 ^ 0`	0000 0001	`1 * 3 ^ 0 = 1`
     `3 ^ 1`	0000 0010	`1 * 3 ^ 1 = 3`
     `3 ^ 2`	0000 0100	`1 * 3 ^ 2 = 9`
     `3 ^ 3`	0000 1000	`1 * 3 ^ 3 = 27`
     `3 ^ 4`	0001 0000	`1 * 3 ^ 4 = 81`
     `3 ^ 5`	0010 0000	`1 * 3 ^ 5 = 243`
     `3 ^ 6`	0100 0000	`1 * 3 ^ 6 = 729`
     `3 ^ 7`	1000 0000	`1 * 3 ^ 7 = 2187`
     Clearly, to get to next consecutive power of three, a single left shift of 1 bit is sufficient. The built-in toString() library will automatically convert the number to the specified base. Regex is then used to check for regular expression of the form "^10*$".

     ^1 is used to specified that string starts with 1.
     0* is used to specified that string contains `0` or more number of zeros.
     $ terminates the expression by matching the end of a line and check that it contains no other characters.*/
    /**
     * SOLUTION 2
     */

    public boolean isPowerOfThree2(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        if (n % 3 != 0) return false;
        return isPowerOfThree2(n / 3);
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number. `b` in this case would be `3`.

     Time Complexity:

     Best Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Average Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Auxiliary Space:

     Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input. The extra space is needed to store the stack frames used in the recursive call. The number of stack frame will equal to how many times the number can be divided by `3`.
     Algorithm

     Approach: Repeated Division (Recursive)

     This algorithm establishes the base case where n == 1 is a power of three. Negative and zero number can never be a power of three as well as those that are not multiple of `3` can never be a power of three. With this base case established, the algorithm recursively divide the number by `3` to reach the base case. If it is not power of three, the final division will result in `0` or `1` otherwise.*/

    /**
     * SOLUTION 3
     */

    public boolean isPowerOfThree3(int n) {
        if (n > 1) {
            while (n % 3 == 0) {
                n /= 3;
            }
        }
        return n == 1;
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number. `b` in this case would be `3`.

     Time Complexity:

     Best Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Average Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Auxiliary Space:

     Worst Case `O(1)` : No additional memory is required.
     Algorithm

     Approach: Repeated Division (Iterative)

     This algorithm will keep on dividing the number until it becomes `1` as long as it can be divided by `3`. The condition while (n % 3 == 0) check if there is a multiple of `3` left in the number. By repeatedly dividing off the number `3`, the final result will either be `1` or `0`. For special input such as negative number or zero, there will be no iterations but instead a jump to compare if it is equal to `1`.*/

    /**
     * SOLUTION 4
     */

    public boolean isPowerOfThree4(int n) {
        long num = 1;
        while (num <= n) {
            if (num == n) {
                return true;
            }
            num = num * 3;
        }
        return false;
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number. `b` in this case would be `3`.

     Time Complexity:

     Best Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Average Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Worst Case `O(log_b(n))` : With respect to the input, the algorithm will always depend on the size of input.
     Auxiliary Space:

     Worst Case `O(1)` : The only additional memory required is a variable which is constant size.
     Algorithm

     Approach: Repeated Multiplication (Iterative)

     This algorithm will keep on multiplying the initial number by `3` until it either reach and exceed the input. If it reach then it is obviously power of three else it it clearly not. In order to counter overflow, long is used as a running sum. This approach is not as effective as a Repeated Division as a special data type is needed to prevent overflow. If the input is going to be type double then an even bigger data type is needed (Possibly BigInteger).*/

    /**
     * SOLUTION 5
     */

    public boolean isPowerOfThree5(int n) {
        int maxPowerOfThree = (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3)));
        return n > 0 && maxPowerOfThree % n == 0;
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number.

     Time Complexity:

     Best Case `Unknown` : With respect to the input, the algorithm will always depend on the size of input. However, it depends on the time complexity of Math.log implemented by Java. `O(1)` with pre-processing.
     Average Case `Unknown`: With respect to the input, the algorithm will always depend on the size of input. However, it depends on the time complexity of Math.log implemented by Java. `O(1)` with pre-processing.
     Worst Case `Unknown` : With respect to the input, the algorithm will always depend on the size of input. However, it depends on the time complexity of Math.log implemented by Java. `O(1)` with pre-processing.
     Auxiliary Space:

     Worst Case `O(1)` : The only additional memory required is a variable which is constant size.
     Algorithm

     Approach: Integer Limitations

     Making use of the fact that `3` is a prime number, the algorithm will calculate the maximum value of power of three that is lesser than Integer.MAX_VALUE. Integer.MAX_VALUE has the value of `2^31 - 1 = 2147483647`. This is done by finding `x` in the equation `3 ^ x = 2147483647`.

     `3 ^ x = 2147483647`
     `x * log_10(3) = log_10(2147483647)`
     `x = log_10(2147483647) / log_10(3) = 19.55882236...`
     Since `x` has to be integer, the maximum power is `floor(19.55882236)= 19`. Hence the maximum value of power of three is `3 ^ 19 = 1162261467`. Hence the find where a number `n` is power of three, it is sufficient to see if `3 ^ 19` can be divided by `n` without any remainder.
     Note that this approach works because `3` is a prime number. Being a prime number means that the only divisors for `3 ^ 19` are `3 ^ 0, 3 ^ 1, 3 ^ 2, ... , 3 ^ 19`.

     With pre-processing, the algorithm can be hard coded with the value of `1162261467` to have a running time of `O(1)`.*/

    /**
     * SOLUTION 6
     */

    public boolean isPowerOfThree6(int n) {
        double error = 0.0000000001;
        return ((Math.log(n) / Math.log(3)) + error) % 1 <= 2 * error;
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number.

     Time Complexity:

     Best Case `Unknown` : With respect to the input, the algorithm will always depend on the size of input. However, it depends on the time complexity of Math.log implemented by Java.
     Average Case `Unknown`: With respect to the input, the algorithm will always depend on the size of input. However, it depends on the time complexity of Math.log implemented by Java.
     Worst Case `Unknown` : With respect to the input, the algorithm will always depend on the size of input. However, it depends on the time complexity of Math.log implemented by Java.
     Auxiliary Space:

     Worst Case `O(1)` : The only additional memory required is a variable which is constant size.
     Algorithm

     Approach: Mathematics

     If `n` is a power of three then it can be represented as `n = 3 ^ x` where `x` is a whole number (with decimal of `.0000...`). `x` can be calculated as:

     `3 ^ x = n`
     `log_10(3 ^ x) = log_10(n)`
     `x * log_10(3) = log_10(n)`
     `x =log_10(n) / log_10(3)`
     To test if a number is an Integer, it is sufficient to see if dividing by `1` gives `0` remainder. ((Math.log(n) / Math.log(3))) % 1 == 0 is the correct statement to test if Math.log(n) / Math.log(3) is an Integer. However, due to double precision error, things are a little more complicated. It can be seen that for input of `243`, Math.log(243) / Math.log(3) = 4.999999999999999. In this case the decimal is reduced by a very small (epsilon) amount and in other case the decimal might increased by a very small (epsilon) amount.

     To account for this error, an error variable is introduced. This variable is here to provide a bound that will tolerate if the answer if less and more by provided error. By trail and error for Integer data type, the working error bound can be `0.0000000001`.

     This error bound is purely experimental and will need to be changed if the input is of data type other than Integer.*/

    /**
     * SOLUTION 7
     */
    private Set<Integer> set = new HashSet<>(Arrays.asList(
            1,
            3,
            9,
            27,
            81,
            243,
            729,
            2187,
            6561,
            19683,
            59049,
            177147,
            531441,
            1594323,
            4782969,
            14348907,
            43046721,
            129140163,
            387420489,
            1162261467
    ));

    public boolean isPowerOfThree7(int n) {
        return set.contains(n);
    }
    /**Complexity Analysis

     Uniform cost model is used as Cost Model and `n` is the input number. `b` in this case would be `3`.

     Time Complexity:

     Best Case `O(1)` : With respect to the input, the algorithm will always run in constant time with HashMap look up.
     Average Case `O(1)`: With respect to the input, the algorithm will always run in constant time with HashMap look up.
     Worst Case `O(1)` : With respect to the input, the algorithm will always run in constant time with HashMap look up.
     Auxiliary Space:

     Worst Case `O(log_b(n))` : The extra space is needed to store all the possible value of power of three which is possible within `2 ^ 31 - 1`. The number of possibles value is `floor(log_10(2 ^ 31 - 1) / log_10(3)) = floor(19.55882236...) = 19`
     Algorithm

     Approach: Hash Map

     Given a small of of candidates for power of three, a HashMap can be preprocessed to contain all the possibilities.*/
}

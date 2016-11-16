package easy; /**
 * Created by ROYBOTX on 11/15/2016.
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 * <p>
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * Example:
 * <p>
 * n = 15,
 * <p>
 * Return:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 */
public class Fizz_buzz_412 {
    @Test
    public void testFizzBuzz(){
        List<String> ret = fizzBuzz1(45);
        for(String r: ret)
            System.out.println(r + " ");
    }
    public List<String> fizzBuzz1(int n) {
        List<String> ret = new ArrayList<String>(n);
        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                ret.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                ret.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                ret.add("Buzz");
                buzz = 0;
            } else {
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String item = "";
            if (i % 3 == 0) {
                item += "Fizz";
            }
            if (i % 5 == 0) {
                item += "Buzz";
            }
            if (item.isEmpty()) {
                item = "" + i;
            }
            list.add(item);
        }
        return list;
    }
}

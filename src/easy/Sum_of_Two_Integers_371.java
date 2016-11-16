package easy; /**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/sum-of-two-integers/
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 */
public class Sum_of_Two_Integers_371 {
    public int getSum(int a, int b) {
        boolean carryBit = false;
        int bit = 1;
        int answer = 0;

        for (int i = 0; i < 32; i++) {

            boolean aMask = (a & bit) == bit;
            boolean bMask = (b & bit) == bit;

            //carryBit, bMask, and aMask are all 1
            //We therefore put a 1 in this place and carry a 1
            if (carryBit && bMask && aMask) {
                carryBit = true;
                answer |= bit;
                bit = bit << 1;
                continue;
            }

            //two of carryBit, bMask, and aMask are 1
            //We therefore put a 0 in this place and carry a 1
            if ((carryBit && bMask) || (carryBit && aMask)
                    || (aMask && bMask)) {
                carryBit = true;
                bit = bit << 1;
                continue;
            }

            //only one of carryBit, bMask, and aMask are 1
            //We therefore put a 1 in this place and carry a 0
            if (carryBit || bMask || aMask) {
                carryBit = false;
                answer |= bit;
                bit = bit << 1;
                continue;
            }

            //All of carryBit, bMask, and aMask are 0
            //We therefore put a 0 in this place and carry a 0
            carryBit = false;
            bit = bit << 1;
        }

        return answer;

    }
}

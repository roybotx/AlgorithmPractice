package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class First_Unique_Character_in_a_String_387 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        int len = s.length();
        int[] idx = new int[26];
        int total = 0;
        int i = 1;
        for (char c : s.toCharArray()) {
            int off = c - 'a';
            if (idx[off] == 0) {
                idx[off] = i;
            } else if (idx[off] > 0) {
                idx[off] = -1;
                if (++total == 26) return -1;
            }
            i++;
        }
        int ret = len + 1;
        for (int res : idx) {
            if (res > 0) ret = Math.min(ret, res);
        }
        return ret == len + 1 ? -1 : ret - 1;
    }

    public int firstUniqChar1(String s) {
        int[] lookup = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            lookup[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s.length(); i++){
            if(lookup[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}

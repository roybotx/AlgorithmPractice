package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/ransom-note/
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 */
public class Ransom_Note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<>();
        for (char ch : magazine.toCharArray())
            list.add(ch);
        for (char ch : ransomNote.toCharArray())
            if (!list.remove((Character) ch))
                return false;
        return true;
    }

    public boolean canConstructHashMap(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), 1);
            } else {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i))) {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        for (int num : list) {
            if (num < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstructArray(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++)
            map[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < ransomNote.length(); i++)
            map[ransomNote.charAt(i) - 'a']--;
        for (int num : map)
            if (num < 0)
                return false;
        return true;
    }
}

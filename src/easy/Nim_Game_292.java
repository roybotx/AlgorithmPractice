package easy; /**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/nim-game/
 * 292. Nim Game   QuestionEditorial Solution  My Submissions
 * Total Accepted: 109342
 * Total Submissions: 200675
 * Difficulty: Easy
 * Contributors: Admin
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * <p>
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 * <p>
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 */
public class Nim_Game_292 {
    public boolean canWinNim(int n) {
        return n % 4 != 0; //lose at 4,8,12....
    }
}

package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import utils.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class Same_Tree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else
                return false;
        }
    }
    public boolean isSameTreeAnother(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTreeAnother(p.left, q.left) && isSameTreeAnother(p.right, q.right);
    }
}

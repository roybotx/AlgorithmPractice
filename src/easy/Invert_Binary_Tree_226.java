package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Invert a binary tree.
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * to
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
public class Invert_Binary_Tree_226 {
    public TreeNode iterative(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode polled = q.poll();

            if (polled.left != null || polled.right != null) {

                TreeNode temp = polled.left;
                polled.left = polled.right;
                polled.right = temp;

                if (polled.left != null) q.offer(polled.left);
                if (polled.right != null) q.offer(polled.right);

            }

        }

        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

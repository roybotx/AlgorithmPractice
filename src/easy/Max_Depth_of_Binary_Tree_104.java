package easy;

import utils.TreeNode;

/**
 * Created by ROYBOTX on 11/15/2016.
 */
public class Max_Depth_of_Binary_Tree_104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // if (root.right == null) return 1 + maxDepth(root.left);
        // if (root.left == null) return 1 + maxDepth(root.right);
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); //isLeaf is checked here
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */class Solution {
    int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }

    private TreeNode helper(int[] preorder, int upperBound) {
        if (index == preorder.length || preorder[index] > upperBound) {
            return null;
        }

        int val = preorder[index++];
        TreeNode root = new TreeNode(val);

        root.left = helper(preorder, val);
        root.right = helper(preorder, upperBound);

        return root;
    }
}

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
 */
import java.util.*;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Store inorder values in a HashMap for quick index lookup
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // Start recursive tree construction
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode buildTree(int[] inorder, int inSt, int inEd, int[] postorder, int postSt, int postEd, Map<Integer, Integer> map) {
        // Base Case: No elements left to construct the tree
        if (inSt > inEd || postSt > postEd) {
            return null;
        }

        // The last element of postorder is always the root
        TreeNode root = new TreeNode(postorder[postEd]);

        // Find the root index in inorder
        int inRootIdx = map.get(root.val);

        // Number of elements in the left subtree
        int numsLeft = inRootIdx - inSt;

        // Recursively build left subtree
        root.left = buildTree(inorder, inSt, inRootIdx - 1, postorder, postSt, postSt + numsLeft - 1, map);

        // Recursively build right subtree
        root.right = buildTree(inorder, inRootIdx + 1, inEd, postorder, postSt + numsLeft, postEd - 1, map);

        return root;
    }
}

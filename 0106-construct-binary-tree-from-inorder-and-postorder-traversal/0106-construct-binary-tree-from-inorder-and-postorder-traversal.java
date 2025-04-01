import java.util.*;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Build a map to store the index of each element in inorder
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        // Start building the tree
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode buildTree(int[] inorder, int inSt, int inEd, int[] postorder, int poSt, int posEd, Map<Integer, Integer> map) {
        // Base case: No elements to construct the tree
        if (inSt > inEd || poSt > posEd) {
            return null;
        }

        // The last element in postorder is the root of the tree
        TreeNode root = new TreeNode(postorder[posEd]);

        // Find the root index in inorder
        int pRootIdx = map.get(root.val);

        // The number of nodes in the left subtree
        int numsLeft = pRootIdx - inSt;

        // Recursively build the left subtree
        root.left = buildTree(inorder, inSt, pRootIdx - 1, postorder, poSt, poSt + numsLeft - 1, map);

        // Recursively build the right subtree
        root.right = buildTree(inorder, pRootIdx + 1, inEd, postorder, poSt + numsLeft, posEd - 1, map);

        // Return the root of the subtree
        return root;
    }
}

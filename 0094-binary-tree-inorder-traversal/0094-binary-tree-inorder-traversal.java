import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public void inorder(TreeNode node, List<Integer> res) {
        if (node == null) return;  // Base case: Stop recursion if node is null

        inorder(node.left, res);  // Traverse left subtree
        res.add(node.val);        // Visit the root node
        inorder(node.right, res); // Traverse right subtree
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
}

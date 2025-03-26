import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public void preorder(TreeNode node, List<Integer> res) {
        if (node == null) return;  // Base case

        res.add(node.data);         // Visit root
        preorder(node.left, res);  // Traverse left
        preorder(node.right, res); // Traverse right
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
}

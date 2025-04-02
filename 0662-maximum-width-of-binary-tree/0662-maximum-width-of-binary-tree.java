import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static class Pair {
        TreeNode node;
        int idx;
        Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (!q.isEmpty()) {  
            int levelSize = q.size();
            int FirstIdx = q.peek().idx;  
            int LastIdx = FirstIdx;

            for (int i = 0; i < levelSize; i++) {
                Pair curr = q.poll();
                TreeNode node = curr.node;
                int idx = curr.idx;

                if (node.left != null) q.add(new Pair(node.left, 2 * idx));
                if (node.right != null) q.add(new Pair(node.right, 2 * idx + 1));

                LastIdx = idx;
            }
            
            maxWidth = Math.max(maxWidth, LastIdx - FirstIdx + 1);   
        }
        return maxWidth;
    }
}

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
class Solution {
    public  void preorder(TreeNode root, Queue<TreeNode> q ){
        if(root== null){
            return;
        }
        q.add(root);
        preorder(root.left,q);
        preorder(root.right,q);

    }
    public void flatten(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();


      preorder(root,q);

        TreeNode prevNode = q.poll();
        while(!q.isEmpty()){
            
            TreeNode nextNode =q.poll();
            prevNode.left =null;
            prevNode.right = nextNode;
            prevNode =nextNode;
        }

        
    }
}
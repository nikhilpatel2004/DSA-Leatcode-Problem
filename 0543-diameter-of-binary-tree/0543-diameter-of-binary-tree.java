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
   private  int maxDiam = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        Diameter(root);
        return maxDiam;
        
    }
    public  int Diameter(TreeNode node){
        if(node == null) return 0;

        int leftHeight = Diameter(node.left );
        int rightHeight = Diameter(node.right);


      maxDiam  =  Math.max(maxDiam , leftHeight+ rightHeight);
        return 1+(Math.max (leftHeight , rightHeight));



    }


}
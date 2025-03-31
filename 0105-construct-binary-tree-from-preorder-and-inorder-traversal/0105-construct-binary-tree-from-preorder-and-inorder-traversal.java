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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<inorder.length;i++){
            map.put(inorder[i],i);
            
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);

        return root;
    }
   private TreeNode buildTree(int[] preorder, int preSt, int preEd, int[] inorder, int inSt, int inEd, Map<Integer, Integer> map)
{
        if(preSt>preEd || inSt>inEd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preSt]);
        int inrootidx = map.get(root.val);
        int numsleft = inrootidx-inSt;

        root.left = buildTree(preorder , preSt+1, preSt+numsleft, inorder,inSt,inrootidx-1,map);
        root.right = buildTree(preorder, preSt+numsleft+1, preEd, inorder,inrootidx+1, inEd,map);

        return root;
  }

}
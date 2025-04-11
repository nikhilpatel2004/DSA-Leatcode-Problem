/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "null";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr== null){
                sb.append("null,");
                continue;
            }
            sb.append(curr.val).append(",");
            queue.offer(curr.left);
            queue.offer(curr.right);
        }
              return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("null"))return null;

        String[] val = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i =1;
        while(!queue.isEmpty() && i<val.length){
            TreeNode curr  = queue.poll();

             if (!val[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(val[i]));
                queue.offer(curr.left);
            }
            i++;
            
            if (i < val.length && !val[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(val[i]));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
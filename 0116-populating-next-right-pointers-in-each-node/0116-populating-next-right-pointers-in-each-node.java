class Solution {
    public Node connect(Node root) {
        // Base case
        if (root == null) {
            return null;
        }

        // Start from the root level
        Node level = root;

        while (level.left != null) {
            Node curr = level;

            while (curr != null) {
                // Connect left child to right child
                curr.left.next = curr.right;

                // If there's a next node, connect right child to next node's left child
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }

                // Move to the next node in the same level
                curr = curr.next;
            }

            // Move to the next level
            level = level.left;
        }

        return root;
    }
}

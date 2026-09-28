class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null)
            return true;

        if (root == null)
            return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            // If values match, check whether the complete trees are same
            if (current.val == subRoot.val) {
                if (isSameTree(current, subRoot))
                    return true;
            }

            // Continue searching in the whole root tree
            if (current.left != null)
                queue.offer(current.left);

            if (current.right != null)
                queue.offer(current.right);
        }

        return false;
    }

    // Iterative Same Tree
    public boolean isSameTree(TreeNode root1, TreeNode root2) {

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.offer(root1);
        q2.offer(root2);

        while (!q1.isEmpty() && !q2.isEmpty()) {

            TreeNode current1 = q1.poll();
            TreeNode current2 = q2.poll();

            if (current1 == null && current2 == null)
                continue;

            if (current1 == null || current2 == null)
                return false;

            if (current1.val != current2.val)
                return false;

            q1.offer(current1.left);
            q1.offer(current1.right);

            q2.offer(current2.left);
            q2.offer(current2.right);
        }

        return q1.isEmpty() && q2.isEmpty();
    }
}
class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // If subRoot is null, it is a subtree
        if (subRoot == null) {
            return true;
        }

        // root is null but subRoot is not
        if (root == null) {
            return false;
        }

        // If current nodes match, check whether
        // subRoot is exactly the same tree here
        if (root.val == subRoot.val) {
            if (isSameTree(root, subRoot)) {
                return true;
            }
        }

        // Preorder: current → left → right
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    // Check whether two trees are exactly the same
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
class Solution {
    int diameter=0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;

    }
        public int height(TreeNode root){
            if(root==null){
                return 0;
            }
            int heightleft= height(root.left);
            int heightright= height(root.right);
            diameter= Math.max(diameter, heightleft+heightright);
            return Math .max(heightleft, heightright)+1;
        
    
        

    }
}

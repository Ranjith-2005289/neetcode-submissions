

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int heightleft= height(root.left);
        int heightright= height(root.right);
        if(Math.abs(heightleft-heightright)>1){
            return false;

        }
        return isBalanced(root.left) && isBalanced(root.right);  
        
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int heightleft= height(root.left);
        int heightright= height(root.right);
        return Math.max(heightleft, heightright)+1;
    }
    
}

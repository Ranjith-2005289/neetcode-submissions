class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root==null){
        return null;
       } 
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
        TreeNode current = queue.poll();
        // 1st thing u swap the left and right of poped node
        //initially root is 1 and will pop it out and swap its child nodes that 2 and 3 to 3 and 2 and now will these childs nodes to queue
        //again pop 2 from the queue and swap its child and add to the queue and pop 3 and swap its child nodes and add its child to queue 
        // finally u will return the root that is invert binary tree
        TreeNode temp=current.left;
        current.left= current.right;
        current.right= temp;
        if(current.left!=null){
            queue.offer(current.left);
        }
        if(current.right!=null){
            queue.offer(current.right);
        }
        
       } 
         return root;  
    }
}

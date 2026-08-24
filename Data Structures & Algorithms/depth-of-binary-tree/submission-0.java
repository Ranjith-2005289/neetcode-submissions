
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0; i<size; i++){
                TreeNode current= queue.poll();
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            depth++;
        }
        return depth;
        

        
    }
}

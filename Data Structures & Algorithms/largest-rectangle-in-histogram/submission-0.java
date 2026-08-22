class Solution {
    public int largestRectangleArea(int[] height) {
        Stack <Integer> stack= new Stack<>();
        int max=0;
        int n =height.length;
        for(int i=0; i<=n; i++){
            while(!stack.isEmpty() && (i==n || height[stack.peek()]> height[i])){
                int h= height[stack.pop()];

                int w;
                if(stack.isEmpty()){
                    w=i;
                }else{
                    w= i-stack.peek()-1;

                }
                max= Math.max(max, h*w);

            }
            stack.push(i);
        
        }
        return max;
        
    }
}

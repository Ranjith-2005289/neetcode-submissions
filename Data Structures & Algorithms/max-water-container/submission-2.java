class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right= heights.length-1;
        int maxarea=0;
        while(left<right){
            int minheight= Math.min(heights[left],heights[right]);
            int width=right-left;
            int ammount_water=minheight*width;
            maxarea=Math.max(maxarea, ammount_water);
            if(heights[left]<=heights[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxarea;
    }
}

//case 1: all the numbers are positive
//case 2: both positive and negative 
//case 3: postive, negative and 0 
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftproduct=0;
        int rightproduct=0;
        int ans=nums[0];
        for(int i=0; i<n;i++){
            leftproduct=leftproduct==0 ? 1:leftproduct;
            rightproduct= rightproduct==0 ? 1: rightproduct;
            leftproduct*=nums[i];
            rightproduct*=nums[n-1-i];
            ans=Math.max(ans, Math.max(leftproduct, rightproduct));

        
        }
        return ans;
        
    }
}

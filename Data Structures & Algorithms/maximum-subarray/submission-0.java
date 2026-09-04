class Solution {
    public int maxSubArray(int[] nums) {
        int currentmax=0;
        int currentsoofar=nums[0];
     for(int i=0; i<nums.length; i++){
        currentmax=Math.max(nums[i], currentmax+nums[i]);
        currentsoofar=Math.max(currentmax, currentsoofar);
     }
     return currentsoofar;

        
    }
}

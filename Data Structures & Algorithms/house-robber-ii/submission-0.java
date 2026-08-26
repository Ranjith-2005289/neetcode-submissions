class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] skip1st= new int[nums.length-1];
        int[] skiplast= new int [nums.length-1];
        for(int i=0; i<nums.length-1; i++){
            skip1st[i]=nums[i];
            skiplast[i]= nums[i+1];

        }
        int lootskip1st=robhouse(skip1st);
        int lootskiplast= robhouse(skiplast);
        return Math.max(lootskip1st, lootskiplast);
        
        
    }
    public int robhouse(int[] nums){
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp= new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);

        }
        return dp[n-1];

    }

}

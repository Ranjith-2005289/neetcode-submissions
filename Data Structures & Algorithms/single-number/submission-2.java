class Solution {
    public int singleNumber(int[] nums) {
        
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans=ans^nums[i];
         //nums=[3,2,3]
         //0 ^ 3 = 3
         //3 ^ 2 = 1
         //1 ^ 3 = 2
        }
        return ans;
    }
}

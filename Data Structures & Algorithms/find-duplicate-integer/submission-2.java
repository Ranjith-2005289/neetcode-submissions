class Solution {
    public int findDuplicate(int[] nums) {
        //phase 1: find intersection point
        int slow= nums[0];
        int fast= nums[0];
        while(true){
            slow= nums[slow];
            fast= nums[nums[fast]];
            if(slow==fast){
                break;
            }

        }   //phase 2: find entranc of cycle.
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
     
        return slow;
        
    }
}

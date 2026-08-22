class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int x: nums){
            set.add(x);

        }
        int ans=0;
        //check every number
        for(int x:set){
            if(!set.contains(x-1)){
                int count=1;
                int num=x;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                ans=Math.max(ans, count);
            }
        }
        return ans;
    }
}

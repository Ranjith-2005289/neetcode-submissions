class Solution {
    public int maxProfit(int[] p) {
        int minp=p[0];
        int maxp=0;
        for(int i=0; i<p.length; i++){
            if(p[i]<minp){
                minp=p[i];
            }
            int profit=p[i]-minp;
            maxp=Math.max(maxp,profit);
        }
        return maxp;
        
    }
}

class Solution {
    public int maxProfit(int[] p) {
        int minp=p[0];
        int max=0;
        for(int i=0; i<p.length; i++){
            if(p[i]<minp){
                minp=p[i];    
            }
            max=Math.max(max, p[i]-minp);
        }
        return max;
        
    }
}

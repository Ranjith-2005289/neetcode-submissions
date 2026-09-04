class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum=0;
        int costsum=0;
        for(int i=0; i<gas.length; i++){
            gassum+=gas[i];
            costsum+=cost[i];
        }
       
        if(gassum<costsum){
            return -1;
            
        }
        int startindex=0;
        int currentindex=0;
        for(int i=0; i<gas.length; i++){
            currentindex+=gas[i]-cost[i];
            if(currentindex<0){
                currentindex=0;
                startindex=i+1;
            }
        }
        return startindex;
    }
}

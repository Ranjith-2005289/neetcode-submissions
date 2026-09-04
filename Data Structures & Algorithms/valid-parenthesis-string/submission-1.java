class Solution {
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;
        for(char str : s.toCharArray()){
            if(str=='('){
                min++;
                max++;
            }
            else if(str==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(max<0){
                return false;
            } 
           min=Math.max(min,0);
        }
        
        return min==0;
    }
}

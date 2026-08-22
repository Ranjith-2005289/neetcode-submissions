class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n= temp.length;
        Stack<Integer> stack= new Stack<>();
        int [] result= new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && temp[i]>=temp[stack.peek()] ){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i]= stack.peek()-i;
            }
            stack.push(i);
        }
        return result;
        
    }
}

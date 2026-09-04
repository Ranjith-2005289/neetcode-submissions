class Solution {
    public List<Integer> partitionLabels(String s) {
        // create a array to store the length of each string
        List<Integer> ans= new ArrayList<>();
        // start with 0
        int i=0;
        // take while loop and keep condition to stop
        while(i<s.length()){
            int start=i;
            int end=s.lastIndexOf(s.charAt(i));
            //check all the character lie side to lastindex
            for(int j=start; j<=end; j++){
                int last=s.lastIndexOf(s.charAt(j));
                if(last>end){
                    end=last;
                }
            }
            //add the length of the string to the ans
            ans.add(end-start+1);
            i=end+1;    

        }
        return ans;
        
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st=new Stack<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(new int[]{ch,1});
                continue;
            }
            if(st.peek()[0]==ch){
                st.peek()[1]++;
                 if(st.peek()[1]==k){
                st.pop();
                continue;
            }
            
            }
            else{
                st.push(new int[]{ch,1});
            }
           
        }
        
        for(int[] pair:st){
            char c=(char) pair[0];
            int count=pair[1];
            while(count-->0){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
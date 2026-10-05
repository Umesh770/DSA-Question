class Solution {
    public int scoreOfParentheses(String s) {
         Stack<Integer> st = new Stack<>();

         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(0);
            }
            else{
                int top=st.pop();
                if(top==0){
                   top=1;
                }
                else {
                    top=2*top;
                }
                if(!st.isEmpty()){
                    int parent=st.pop();
                    st.push(parent+top);
                }
                else{
                    st.push(top);
                }
            }
         }
         return st.pop();
    }
}
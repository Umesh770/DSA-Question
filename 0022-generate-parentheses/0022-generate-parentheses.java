class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        backtrack("",0,0,n);
        return ans;
    }
    public void backtrack(String path,int open,int close,int n){
        if(path.length()==2*n){
            ans.add(path);
        }

        if(open<n){
            backtrack(path+"(",open+1,close,n);
        }
        if(close<open){
            backtrack(path+")",open,close+1,n);
        }
    }
}
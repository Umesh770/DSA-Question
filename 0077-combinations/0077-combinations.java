class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> curr=new ArrayList<>();

        fun(1,n,k,ans,curr);
        return ans;
    }
    public void fun(int start,int n,int k,List<List<Integer>> ans,List<Integer> curr){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<=n-(k-curr.size())+1;i++){
            curr.add(i);
            fun(i+1,n,k,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}
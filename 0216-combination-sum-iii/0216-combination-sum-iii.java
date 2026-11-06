class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<Integer> path=new ArrayList<>();

        backtrack(arr,0,0,k,n,path);
        return ans;
    }
    public void backtrack(int[] arr,int index,int sum,int k,int n,List<Integer> path){
        if(path.size()==k && sum==n){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(path.size()==k || index == arr.length || sum>n){
            return;
        }
        path.add(arr[index]);
        sum+=arr[index];
        backtrack(arr,index+1,sum,k,n,path);
        path.remove(path.size()-1);
        sum-=arr[index];

        
         backtrack(arr,index+1,sum,k,n,path);
    }
}
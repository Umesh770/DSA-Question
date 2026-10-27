class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
        List<Integer> path=new ArrayList<>();
        backtrack(candidates,0,0,ans,path,target);
        return ans;
    }
    public void backtrack(int[] candidates,int index,int sum,List<List<Integer>> ans,List<Integer> path,int target){
        if(sum==target){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(index==candidates.length|| sum>target){
            return;
        }
        path.add(candidates[index]);
        sum+=candidates[index];
        backtrack(candidates,index+1,sum,ans,path,target);

        path.remove(path.size()-1);
        sum-=candidates[index];

        int next=index+1;
        while(next<candidates.length && candidates[next]==candidates[index]){
            next++;
        }
        backtrack(candidates,next,sum,ans,path,target);
    }
}
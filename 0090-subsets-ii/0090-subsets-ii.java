class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> path=new ArrayList<>();

        backtrack(nums,0,ans,path);
        return ans;
    }
    public void backtrack(int[] nums,int index,List<List<Integer>> ans, List<Integer> path){

        
        if(index==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        
        path.add(nums[index]);
        
        backtrack(nums,index+1,ans,path);

        path.remove(path.size()-1);
        int next=index+1;
        while(next<nums.length && nums[next]==nums[index]){
            next++;
        }
        backtrack(nums,next,ans,path);
    }
}
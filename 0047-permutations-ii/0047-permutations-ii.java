class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
       
        backtrack(nums,0);
       
        return ans;
    }
    public void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void backtrack(int[] nums,int index){
        HashSet<Integer> set=new HashSet<>();
        if(index==nums.length){
            List<Integer> path=new ArrayList<>();
            for(int num:nums){
                path.add(num);
            }
            ans.add(path);
            
            return;
        }
        for(int i=index;i<nums.length;i++){
           if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            swap(nums,index,i);
             
            backtrack(nums,index+1);
             swap(nums,index,i);
        }
    }
}
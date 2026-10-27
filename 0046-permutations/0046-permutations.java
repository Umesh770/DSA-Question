class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       
        backtrack(nums,0);
        return ans;
    }
    public void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public void backtrack(int[] nums,int index){
        if(index==nums.length){
             List<Integer> path=new ArrayList<>();
             for(int num:nums){
                path.add(num);
             }
            ans.add(path);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            backtrack(nums,index+1);
             swap(nums,index,i);
        }
    }

}
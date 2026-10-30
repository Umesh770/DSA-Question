class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxor=0;
        for(int num:nums){
            maxor|=num;
        }
        return backtrack(nums,0,0,maxor);
    }
    public int backtrack(int[] nums,int index,int or,int maxor){
         
        if(index==nums.length){
            if(or==maxor){
               
                return 1;
            }
            return 0;
        }
       
        int pick=backtrack(nums,index+1,or|nums[index], maxor);

       
        int notpick=backtrack(nums,index+1,or,maxor);
        return pick+notpick;
    }
}
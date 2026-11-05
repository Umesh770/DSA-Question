class Solution {
    public int subsetXORSum(int[] nums) {
        
        int count=backtrack(nums,0,0);
        return count;
    }
    public int  backtrack(int[] nums,int index,int sum){

        if(index==nums.length){
            return sum;
        }
        int pick=backtrack(nums,index+1,sum^nums[index]);
        int notpick=backtrack(nums,index+1,sum);

        return pick+notpick;
    }
}
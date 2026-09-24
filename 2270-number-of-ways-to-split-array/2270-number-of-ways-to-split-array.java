class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long leftsum=0;
        long rightsum=0;
        long total=0;
        for(int num:nums){
            total+=num;
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            rightsum=total-leftsum;
            if(leftsum>=rightsum){
                count++;
            }
            
        }
        return count;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int l=0;
        for(int i=0;i<nums.length;i++){
            int right=total-l-nums[i];
            if(l==right){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}
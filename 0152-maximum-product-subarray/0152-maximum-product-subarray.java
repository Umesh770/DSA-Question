class Solution {
    public int maxProduct(int[] nums) {
        int currmax=nums[0];
        int currmin=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            int tempmax=currmax;
            int tempmin=currmin;
            currmax=Math.max(num,Math.max(num*tempmax,num*tempmin));
            currmin=Math.min(num,Math.min(num*tempmax,num*tempmin));

            ans=Math.max(ans,currmax);
        }
        return ans;
    }
}
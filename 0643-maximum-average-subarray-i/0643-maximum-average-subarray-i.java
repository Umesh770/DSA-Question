class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
       
       
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int right=k;right<nums.length;right++){
            sum+=nums[right];
            sum-=nums[right-k]--;
           max=Math.max(max,sum);
        }
        return (double)max/k;
    }
}
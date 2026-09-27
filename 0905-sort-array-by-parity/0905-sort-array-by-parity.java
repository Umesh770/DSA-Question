class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int low=0;
        int j=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[low]=nums[i];
                low++;
            }
            else{
                ans[j]=nums[i];
                j--;
            }
        }
        return ans;
    }
}
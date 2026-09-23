class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int leftsum=0;
        int rightsum=0;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
       
       for(int i=0;i<n;i++){
        leftsum=(i==0)?0:prefix[i-1];
        rightsum=(i==n-1)?0:suffix[i+1];
        if(leftsum==rightsum){
            return i;
        }
       }
       return -1;
    }
}
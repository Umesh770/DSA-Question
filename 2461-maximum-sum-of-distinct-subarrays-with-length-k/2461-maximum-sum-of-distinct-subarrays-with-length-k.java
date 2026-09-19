class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==1){
                sum+=nums[i];
            }
           
        }
        long max=0;
        if(map.size()==k){
            max=sum;
        }
        for(int r=k;r<nums.length;r++){
            int curr=nums[r];
            map.put(curr,map.getOrDefault(curr,0)+1);
            if(map.get(curr)==1){
                sum+=curr;
            }
           
            int old=nums[r-k];
            map.put(old,map.get(old)-1);
            if(map.get(old)==0){
                map.remove(old);
                sum-=old;
            }
           if(map.size()==k){
             max=Math.max(max,sum);
           }
        }
        return max;
    }
}
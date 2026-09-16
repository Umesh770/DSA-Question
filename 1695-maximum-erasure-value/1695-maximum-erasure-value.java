class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int l=0;
        int sum=0;
       for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            int curr=nums[r];
            while(map.get(curr)>1){
                int old=nums[l];
                sum-=nums[l];
                map.put(old,map.get(old)-1);
                if(map.get(old)==0){
                   
                    
                     map.remove(old);
                   
                }
                 l++;
            }
            max=Math.max(max,sum);
       }
        return max;
    }
}
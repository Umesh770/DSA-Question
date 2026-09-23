class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i:piles){
            high=Math.max(i,high);
        }
        while(low<high){
            int mid=(low+high)/2;
            int hour=0;
            for(int i:piles){
                hour+=(i+mid-1)/mid;
            }
            if(hour<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
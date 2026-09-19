class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            count++;
        }
        for(int r=k;r<arr.length;r++){
            sum+=arr[r];
            sum-=arr[r-k];
            if(sum/k>=threshold){
                count++;
            }
        }
        return count;
    }
}
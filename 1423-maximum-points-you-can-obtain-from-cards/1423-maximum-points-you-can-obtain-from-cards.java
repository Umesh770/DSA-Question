class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n=cardPoints.length;
        int total=0;
        int windowsize=n-k;

        for(int value:cardPoints){
            total+=value;
        }
        int windowsum=0;
        for(int i=0;i<windowsize;i++){
            windowsum+=cardPoints[i];
        }
        int windowmin=windowsum;
        for(int i=windowsize;i<n;i++){
            windowsum+=cardPoints[i];
            windowsum-=cardPoints[i-windowsize];
            windowmin=Math.min(windowmin,windowsum);
        }
        return total-windowmin;
    }
}
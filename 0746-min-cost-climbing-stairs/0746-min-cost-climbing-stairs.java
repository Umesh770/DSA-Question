class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return  Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
     public int solve(int i,int[] cost,int[] dp){
            if(i>=cost.length){
                return 0;
            }
            if(dp[i]!=-1){
                return dp[i];
            }
            int one=solve(i+1,cost,dp);
            int two=solve(i+2,cost,dp);
           dp[i]=cost[i]+ Math.min(one,two);
            return dp[i];
    }
}
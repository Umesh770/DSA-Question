class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];
        boolean[][] visited=new boolean[n][n];
        return solve(0,0,triangle,dp,visited);
    }
    public int solve(int i,int j,List<List<Integer>> triangle,int[][] dp,boolean[][] visited){
        int n=triangle.size();
        if(i==n-1){
            return triangle.get(i).get(j);
        }
        if(visited[i][j]){
            return dp[i][j];
        }
        int down=solve(i+1,j,triangle,dp,visited);
        int dig=solve(i+1,j+1,triangle,dp,visited);

        dp[i][j]=triangle.get(i).get(j)+Math.min(down,dig);
        visited[i][j]=true;
        return dp[i][j];
    }
}
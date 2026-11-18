class Solution {
    public int numIslands(char[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    dfs(i,j,m,n,grid,visited);
                }
            }
        }
        return count;
    }
    static void dfs(int i,int j,int m,int n,char[][] grid,boolean[][] visited){
        if(i<0 || i>=m ||  j<0 || j>=n ||  grid[i][j]=='0' || visited[i][j]){
            return;
        }

        visited[i][j]=true;
        dfs(i+1,j,m,n,grid,visited);
         dfs(i-1,j,m,n,grid,visited);
          dfs(i,j+1,m,n,grid,visited);
           dfs(i,j-1,m,n,grid,visited);
    }
}
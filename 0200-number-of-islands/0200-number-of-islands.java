class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;//행
        int n = grid[0].length;//열
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for(int r =0; r<m; r++){
            for(int c =0; c<n; c++){
                if(grid[r][c]=='1' && !visited[r][c]){
                    visited[r][c] = true;
                    dfs(grid,r,c,visited,m,n);
                    count++;
                }
            }
        }

        return count;
    }

    int[] dx = new int[]{-1,0,1,0};
    int[] dy = new int[]{0,1,0,-1};

    public void dfs(char[][] grid, int startR, int startC, boolean[][] visited, int m, int n){

        int curR = startR;
        int curC = startC;

        for(int i=0; i<4; i++){
            int nextR = curR + dx[i];
            int nextC = curC + dy[i];

            if(nextR>=0 && nextR<m && nextC>=0 && nextC<n && !visited[nextR][nextC] && grid[nextR][nextC]=='1'){
                visited[nextR][nextC] = true;
                dfs(grid,nextR,nextC,visited,m,n);
            }
        }

    }
}
class Solution {

    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,1,0,-1};

    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i<m  ; i++){
            for (int j = 0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    
                    visited[i][j] = true;
                    boolean result = dfs(board, word, visited, m, n, i,j,0);
                    
                    if(result){
                        return true;
                    }

                    visited[i][j] = false;

                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, boolean[][] visited, int m, int n, int startX, int startY, int count){

        int curX = startX;
        int curY = startY;

        if(count== word.length()-1){
            return true;
        }

        for(int i=0; i<4; i++){
            
            int nextX=curX+dx[i];
            int nextY=curY+dy[i];

            if(nextX>=0 && nextY>=0 && nextX<m && nextY<n && !visited[nextX][nextY]){

                if(word.charAt(count+1) == board[nextX][nextY]){
                
                    visited[nextX][nextY] = true;
                    boolean result = dfs(board, word, visited, m, n, nextX, nextY, count+1);

                    if(result){
                        return true;
                    }
                    
                    visited[nextX][nextY] = false;
                }

            }
        }


        return false;

    }
}
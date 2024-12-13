class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int vis[][] = new int[m][n];
        //lets start with checking the boundry elements, coz boundry elemnts cant be converted, and lattr use dfs
        for(int j=0;j<n;j++){
            if(vis[0][j] == 0 && board[0][j]=='O'){
                dfs(board,vis,0,j);
            }
            if(vis[m-1][j] == 0 && board[m-1][j]=='O'){
                dfs(board,vis,m-1,j);
            }
        }
        for(int i=0;i<m;i++){
            if(vis[i][0]== 0 && board[i][0]=='O'){
                dfs(board,vis,i,0);
            }
            if(vis[i][n-1]==0 && board[i][n-1]=='O'){
                dfs(board,vis,i,n-1);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j] == 0 && board[i][j] == 'O') 
                    board[i][j] = 'X'; 
            }
        }
        
    }
    void dfs(char board[][], int vis[][], int i, int j){
        vis[i][j]=1;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, 1, 0, -1};
        int m = board.length;
        int n = board[0].length;
        for(int x=0;x<4;x++){
            int nrow = i+delrow[x];
            int ncol = j+delcol[x];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && board[nrow][ncol]=='O')
            dfs(board,vis,nrow,ncol);
        }
    }
}
//BFS Approach
//TC: O(MXN)
//SC: O(1)
class Solution {
    int rows;
    int cols;
    public void gameOfLife(int[][] board) {
        //edge case
        if(board == null || board.length == 0) return;

        //0 -> 2
        //1 -> 3
        //general case
        rows = board.length;
        cols = board[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                //rule 1 and 3 
                int count = getLivesCount(board, i, j);
                if(board[i][j] == 1 && (count < 2 || count > 3)){
                    board[i][j] = 2;
                }
                //rule 4
                if(board[i][j] == 0 && count == 3){
                    board[i][j] = 3;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 3){
                    board[i][j] = 1;
                }
                if(board[i][j] == 2){
                    board[i][j] = 0;
                }
            }
        }
    }
    private int getLivesCount(int[][] board, int i, int j){
        int count = 0;
        int[][] dirs = new int[][]{{0,1},{1,0}, {0,-1}, {-1,0}, {1,1},{-1,-1},{1,-1},{-1,1}};
        for(int[] dir : dirs){
            int r = i + dir[0];
            int c = j + dir[1];
            if(r >= 0 && c >= 0 && r < rows && c < cols && (board[r][c] == 1 || board[r][c] == 2)){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        int[][] updatedBoard = new int[m][n];
        
        // Iterate through each cell in the original board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the new state for the current cell
                int newState = calculateNewState(board, i, j, m, n);
                // Update the corresponding cell in the updated board
                updatedBoard[i][j] = newState;
            }
        }
        
        // Copy the updated states back to the original board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = updatedBoard[i][j];
            }
        }
    }
    
    private int calculateNewState(int[][] board, int i, int j, int m, int n) {
        int liveNeighbors = countLiveNeighbors(board, i, j, m, n);
        int currentState = board[i][j];
        
        // Apply rules of the Game of Life
        if (currentState == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
            return 0; // Cell dies due to underpopulation or overpopulation
        } else if (currentState == 0 && liveNeighbors == 3) {
            return 1; // Cell becomes alive due to reproduction
        } else {
            return currentState; // Cell remains in the same state
        }
    }
    
    private int countLiveNeighbors(int[][] board, int i, int j, int m, int n) {
        int[][] directions = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1} };
        int count = 0;
        
        for (int[] dir : directions) {
            int newRow = i + dir[0];
            int newCol = j + dir[1];
            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && board[newRow][newCol] == 1) {
                count++;
            }
        }
        
        return count;
    }
}

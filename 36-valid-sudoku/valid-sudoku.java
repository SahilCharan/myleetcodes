class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Step 1 : row-wise Checking
        for(int i=0;i<9;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<9;j++){
                if(hs.contains(board[i][j]+'0')){
                    return false;
                }
                if(board[i][j]!='.'){
                    hs.add(board[i][j]+'0');
                }
            }
        }
        // step 2 : column-wise Checking
        for(int i=0;i<9;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<9;j++){
                if(hs.contains(board[j][i]+'0')){
                    return false;
                }
                if(board[j][i]!='.'){            
                    hs.add(board[j][i]+'0');
                }
            }
        }
        // step 3 : matrix-wise Checking
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Integer> hs = new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(hs.contains(board[k][l]+'0')){
                            return false;
                        }
                        if(board[k][l]!='.'){            
                            hs.add(board[k][l]+'0');
                        }
                    }
                }
            }
        }
        return true;
    }
}
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i =0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(recur(board,word,i,j,m,n,0))
                    return true;
                }
            }
        }
        return false;
    }
    public boolean recur(char[][] board,String word, int i, int j,int m, int n, int index)
    {
         if (index == word.length()) {
            return true;}
        if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) ) {
            return false;}

        if(board[i][j]=='#')
        return false;

        char temp = board[i][j];
        board[i][j]= '#';
        
       boolean found = recur(board, word,i+1,j,m,n,index+1) ||
        recur(board, word,i-1,j,m,n,index+1)||
        recur(board, word,i,j+1,m,n,index+1)||
        recur(board, word,i,j-1,m,n,index+1);

        board[i][j] = temp;

        return found;

}
}
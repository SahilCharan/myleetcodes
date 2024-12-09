class Solution {
    public int orangesRotting(int[][] grid) {
        //there will be multiple entry entry points, that is multiple rotten oranges
        Queue<int[]>q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int vis[][] = grid;
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==2){
                    q.offer(new int[] {i,j});
                }
                if(vis[i][j]==1){
                    count++;
                }
            }
        }
        if(count==0)
        return 0;
        if(q.isEmpty())
        return -1;

        int time =-1;
        int directions[][] = {{1,0},{-1,0},{0,-1},{0,1}};
        while((!q.isEmpty())){
            int size = q.size();
            while(size-->0){
                int cell[] = q.poll();
                int x = cell[0];
                int y = cell[1];
                for(int[] dir:directions){
                    int i = x+dir[0];
                    int j = y+dir[1];
                    if(i>=0 &&i<m &&j>=0 &&j<n && vis[i][j]==1){
                        vis[i][j]=2;
                        count--;
                        q.offer(new int[] {i,j});
                    }
                }
            }
            time++;
        }
        if(count==0)
        return time;

        return -1;



    }
}
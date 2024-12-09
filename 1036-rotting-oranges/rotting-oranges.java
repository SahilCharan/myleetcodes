class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n= grid[0].length;
        int copy[][] = grid;
        int time =-1;
        int count =0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(copy[i][j]==2){
                    q.offer(new int[] {i,j});
                }
                if(copy[i][j]==1)
                count++;
            }
        }
        if(count ==0)
        return 0;
        if(q.isEmpty())
        return -1;

        int dir[][] = {{1,0},{-1,0},{0,-1},{0,1}};
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-->0){
                int curr[] = q.poll();
                int x = curr[0];
                int y = curr[1];
                for(int d[]:dir){
                    int i = x+d[0];
                    int j = y+d[1];
                    if(i>=0 &&i<m && j>=0 && j<n && copy[i][j]==1){
                        copy[i][j] = 2;
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
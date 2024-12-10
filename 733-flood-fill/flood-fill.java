class Solution {
    int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int orig = image[sr][sc];

        if(orig == color) return image;
        Queue<int[]>q = new LinkedList<>();
        q.offer(new int[] {sr,sc});
        //int copy[][] = image;
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int x = curr[0];
            int y = curr[1];
            image[x][y] = color;
            for(int a[] : dir){
                int i = x+a[0];
                int j = y+a[1];
                if(i>=0&&i<m && j>=0 && j<n && image[i][j]== orig){
                    
                    q.offer(new int[] {i,j});
                }
            }
        }
        return image;

    }
}
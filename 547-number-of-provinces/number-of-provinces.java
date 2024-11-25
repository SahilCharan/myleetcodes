class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        //building a graph
        int n =  isConnected.length;
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]!=0 && i!=j){
                graph.get(i).add(j);            }
        }
        }
        int count = 0;
        boolean vis[] = new boolean[graph.size()];
        for(int i =0;i<graph.size();i++){
            if(!vis[i]){
                count++;
                dfs(graph,vis,i);
            }
        }
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>>graph,boolean vis[], int node){
        if(vis[node])
        return;

        for(int it:graph.get(node)){
            vis[node] =true;
            dfs(graph,vis,it);
        }
    }
}